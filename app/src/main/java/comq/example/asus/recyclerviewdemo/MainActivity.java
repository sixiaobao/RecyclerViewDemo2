package comq.example.asus.recyclerviewdemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import comq.example.asus.recyclerviewdemo.Bean.MoviesBean;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements PackagingAdapter.Clickevent,PackagingAdapter.twoClickevent {

    private RecyclerView recycler;
    ArrayList<MoviesBean> arr;
    PackagingAdapter adapter;
    Handler h=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1000:
                    adapter.setData(arr);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recycler = (RecyclerView) findViewById(R.id.recycler);
        adapter=new PackagingAdapter(MainActivity.this);

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
        meshask();
        adapter.getClickevent(this);
        adapter.twogetClickevent(this);


    }

    private void meshask() {
        OkHttpClient okHttpClient=new OkHttpClient();
        Request build = new Request.Builder().url("https://api-m.mtime.cn/PageSubArea/HotPlayMovies.api?locationId=290").build();
        okHttpClient.newCall(build).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("TAG",e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson=new Gson();
                Bean bean = gson.fromJson(string, Bean.class);
                List<MoviesBean> movies = bean.getMovies();
                arr=new ArrayList<MoviesBean>();
                arr.addAll(movies);

                h.sendEmptyMessage(1000);


            }
        });
    }

    @Override
    public void portanswermix(View view, final int potion) {
        Toast.makeText(MainActivity.this,"这是第"+potion+"条数据",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void twoportanswermix(View view, int potion) {
        AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
        ab.setTitle(arr.get(potion).getTitleCn());
        View inflate = View.inflate(MainActivity.this, R.layout.alertdialoglayout, null);
        ab.setView(inflate);
        TextView minute = (TextView) inflate.findViewById(R.id.minute);
        minute.setText("     "+arr.get(potion).getCommonSpecial());
        ab.create();
        ab.show();
    }





}
