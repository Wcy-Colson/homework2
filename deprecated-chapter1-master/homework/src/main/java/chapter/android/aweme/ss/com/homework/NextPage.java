package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);
        TextView temp = findViewById(R.id.textView2);
        String position = getIntent().getStringExtra("position");
        temp.setText("这是第"+position+"消息");
    }
}
