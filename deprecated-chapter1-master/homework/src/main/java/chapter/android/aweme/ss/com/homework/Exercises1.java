package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * ans : onPause -> onStop -> onDestroy -> onCreate -> onStart -> onStart
 */
public class Exercises1 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        Log.v("information","onCreate");
    }

    @Override
    protected  void onStart() {
        super.onStart();
        Log.v("information","onStart");
    }

    @Override
    protected  void onResume(){
        super.onResume();
        Log.v("information","onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("information","onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("information","onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("information","onDestroy");
    }

}
