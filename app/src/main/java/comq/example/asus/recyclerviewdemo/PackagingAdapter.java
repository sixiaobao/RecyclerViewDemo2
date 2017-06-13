package comq.example.asus.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import comq.example.asus.recyclerviewdemo.Bean.MoviesBean;
import comq.example.asus.recyclerviewdemo.base.BaseRecViewAdapter;

import static comq.example.asus.recyclerviewdemo.R.id.movie;
import static comq.example.asus.recyclerviewdemo.R.id.purchase;

/**
 * Created by ASUS on 2017/6/9.
 */

public class PackagingAdapter extends BaseRecViewAdapter<MoviesBean> {
    private static final int TYPE_1=1;
    private static final int TYPE_2=2;

    public PackagingAdapter(Context context) {
        super(context);
    }

    /*@Override
    public int getAdapterItemViewType(int position) {
        if(position<5){
            return TYPE_1;
        }else{
            return TYPE_2;
        }
    }*/

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        /*switch (viewType){
            case TYPE_1:
                return new hoder(parent,R.layout.item_one);
            case TYPE_2:
                return new hoder(parent,R.layout.item_two);
        }*/
        return new hoder(parent,R.layout.item_one);
    }

    class hoder extends RecyclerViewHolder<MoviesBean> implements View.OnClickListener {
        TextView name;
        TextView screentime;
        TextView price;
        TextView performer;
        ImageView one_movie;
        Button purchas;
        public hoder(ViewGroup parent, @LayoutRes int layoutid) {
            super(parent, layoutid);
            itemView.setOnClickListener(this);
            name = (TextView) itemView.findViewById(R.id.name);
            screentime = (TextView) itemView.findViewById(R.id.screentime);
            price = (TextView) itemView.findViewById(R.id.price);
            performer= (TextView) itemView.findViewById(R.id.performer);
            one_movie = (ImageView) itemView.findViewById(movie);
            purchas = (Button) itemView.findViewById(purchase);
            purchas.setOnClickListener(this);

        }


        @Override
        public void setData(MoviesBean data) {
                name.setText(data.getTitleCn());
                screentime.setText(data.getCommonSpecial());
                Glide.with(context).load(data.getImg()).into(one_movie);
                performer.setText(data.getActorName2());
                price.setText(data.getActorName1());

        }



        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.purchase:
                    twoclickevent.twoportanswermix(v,getAdapterPosition());
                    break;
                default:
                    clickevent.portanswermix(v,getAdapterPosition());
                    break;
            }

        }
    }
    public  interface  Clickevent{
        void portanswermix(View view, int potion);
    }
    private Clickevent clickevent;
    public  void getClickevent(Clickevent clickevent){
        this.clickevent=clickevent;
    }
    public  interface  twoClickevent{
        void twoportanswermix(View view, int potion);
    }
    private twoClickevent twoclickevent;
    public  void twogetClickevent(twoClickevent twoclickevent){
        this.twoclickevent=twoclickevent;
    }

}
