package com.example.baigali.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;
import android.widget.Toast;

import com.example.baigali.myapplication.adapter.ReAdapter;
import com.example.baigali.myapplication.api.BaenList;
import com.example.baigali.myapplication.m.MyModel;
import com.example.baigali.myapplication.p.MyPr;
import com.example.baigali.myapplication.v.MainView;

import java.util.ArrayList;

/**
 * @Date //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                           O\  =  /O
 * //                        ____/`---'\____
 * //                      .'  \\|     |//  `.
 * //                     /  \\|||  :  |||//  \
 * //                     /  _||||| -:- |||||-  \
 * //                     |   | \\\  -  /// |   |
 * //                    | \_|  ''\---/''  |   |
 * //                    \  .-\__  `-`  ___/-. /
 * //                  ___`. .'  /--.--\  `. . __
 * //                ."" '<  `.___\_<|>_/___.'  >'"".
 * //              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 * //               \  \ `-.   \_ __\ /__ _/   .-` /  /
 * //          ======`-.____`-.___\_____/___.-`____.-'======
 * //                             `=---='
 * //         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * //                    佛祖保佑        永无BUG
 * //            佛曰:
 * //                  写字楼里写字间，写字间里程序员；
 * //                  程序人员写程序，又拿程序换酒钱。
 * //                  酒醒只在网上坐，酒醉还来网下眠；
 * //                  酒醉酒醒日复日，网上网下年复年。
 * //                  但愿老死电脑间，不愿鞠躬老板前；
 * //                  奔驰宝马贵者趣，公交自行程序员。
 * //                  别人笑我忒疯癫，我笑自己命太贱；
 * //                  不见满街漂亮妹，哪个归得程序员？
 * //                                        --白嘎力
 */

public class MainActivity extends AppCompatActivity implements MainView{

    private RecyclerView mRe;
    private ArrayList<BaenList.ResultsBean> mList;
    private ReAdapter mReAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyPr myPr = new MyPr(new MyModel(), this);
        myPr.getData();
        initView();

    }


    private void initView() {
        mRe = (RecyclerView) findViewById(R.id.Re);
        mList = new ArrayList<>();
        mReAdapter = new ReAdapter(mList);
        mRe.setAdapter(mReAdapter);
        mRe.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setSuccess(BaenList success) {
        mList.addAll(success.getResults());
        mReAdapter.setData(mList);
        mReAdapter.notifyDataSetChanged();
    }

    @Override
    public void setFail(String fail) {
        Log.d("aaa",fail);
        Toast.makeText(this, fail, Toast.LENGTH_LONG).show();
    }
}
