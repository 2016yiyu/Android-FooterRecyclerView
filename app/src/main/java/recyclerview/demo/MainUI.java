package recyclerview.demo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import footer.android.FooterRecyclerView;

/**
 * Created by my on 2016/11/24.
 */

public class MainUI extends AppCompatActivity {
    private FooterRecyclerView footer_rv;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
       setContentView(R.layout.main_ui);
        initView();
    }

    private void initView() {
        footer_rv=(FooterRecyclerView)findViewById(R.id.footer_rv);
        //滑到底部自动加载
        footer_rv.setmIsAutoLoadMore(true);
        //默认开启上拉加载
        footer_rv.setOnLoadListener(new FooterRecyclerView.OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                footer_rv.onLoadMoreComplete();//加载完成
            }
        });
    }
}
