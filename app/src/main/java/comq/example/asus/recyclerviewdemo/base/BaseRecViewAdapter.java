package comq.example.asus.recyclerviewdemo.base;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import comq.example.asus.recyclerviewdemo.xRefreshView.recyclerview.BaseRecyclerAdapter;


public abstract class BaseRecViewAdapter <T> extends BaseRecyclerAdapter<BaseRecViewAdapter.RecyclerViewHolder> {
    private List<T> data=new ArrayList<>();
    public Context context;
    public LayoutInflater mInflater;
    private T t;
    public BaseRecViewAdapter(Context context) {
        this.context=context;
        mInflater = LayoutInflater.from(context);
        data=new ArrayList<>();

    }

    public List<T> getData() {
        return data;
    }

    public T getSelect() {
        return t;
    }

    public void setSelect(T t) {
        this.t = t;
        notifyDataSetChanged();
    }
    private int selectpostition;
    public void setSelect(int t) {
        this.selectpostition = t;
        notifyDataSetChanged();
    }

    public int getSelectpostition() {
        return selectpostition;
    }

    public BaseRecViewAdapter(Context context, ArrayList<T> data) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
        this.data = data;
    }

    public void setData(List<T> data) {
        this.data.clear();
        this.addData(data);
        notifyDataSetChanged();
    }
    public T getItem(int position) {
        return data.get(position);
    }

    public void addData(List<T> data){
        this.data.addAll(data);
        notifyDataSetChanged();
    }
    public void remove(int adapterPosition){
        this.data.remove(adapterPosition);
        notifyItemRemoved(adapterPosition);
    }
    public void clear() {
        this.data.clear();
    notifyDataSetChanged();
    }
    public void remove(T t){
        int i = data.indexOf(t);
        this.data.remove(t);
        notifyItemRemoved(i);
    }
    @Override
    public RecyclerViewHolder getViewHolder(View view) {
          return new RecyclerViewHolder(view) {
              @Override
              public void setData(Object data) {

              }
          };
    }

    @Override
    public abstract RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem);

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position, boolean isItem) {
        holder.setViewAdapter(this);
        holder.setData(getItem(position));
    }

    public  OnItemClickListener onItemclicklistener;

    public  OnItemLongClickListener onItemLongclicklistener;

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongclicklistener) {
        this.onItemLongclicklistener = onItemLongclicklistener;
    }


    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
    public interface OnItemLongClickListener {
        void onItemLongClick(View view, int position);
    }

    public void setItemClickListener(OnItemClickListener onitemclicklistener) {
        this.onItemclicklistener = onitemclicklistener;
    }

    @Override
    public int getAdapterItemCount() {
        return data.size();
    }


    public static abstract  class RecyclerViewHolder<M> extends RecyclerView.ViewHolder {
        BaseRecViewAdapter viewAdapter;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void setViewAdapter(BaseRecViewAdapter viewAdapter) {
            this.viewAdapter = viewAdapter;
        }

        public BaseRecViewAdapter getAdapter() {
            return viewAdapter;
        }

        public boolean isLast(){
            if(viewAdapter==null)return false;
            return  viewAdapter.getData().size()-1==getPosition();
        }

        public RecyclerViewHolder(ViewGroup parent , @LayoutRes int layoutid){
           super(LayoutInflater.from(parent.getContext()).inflate(layoutid,parent,false));
           ButterKnife.bind(this,itemView);
       }

        protected void updateView(Context context, M object) {
            setData(object);
        }

        public abstract void setData(M data);



        public Context getContext(){
            return itemView.getContext();
        }
    }
}
