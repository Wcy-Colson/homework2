package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listexample);
        ListView listview = findViewById(R.id.instance);
        listview.setAdapter(new ListViewAdapter(this));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Exercises3.this,"当前位置"+(position+1),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Exercises3.this,NextPage.class);
                System.out.println(position);
                intent.putExtra("position",Integer.toString(position+1));
                startActivity(intent);
            }
        });
    }

    public static  class ListViewAdapter extends BaseAdapter{

        private int[] args = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        private Context mContext;

        public ListViewAdapter(Context context){mContext=context;}

        @Override
        public int getCount(){return args.length;}

        @Override
        public Object getItem(int position){return null;}

        @Override
        public long getItemId(int position){return 0;}

        @Override
        public View getView(int position, View ConvertView, ViewGroup parent){
            View view;
            if(ConvertView == null){
                    LayoutInflater inflater = LayoutInflater.from(mContext);
                    view  = inflater.inflate(R.layout.im_list_item,null);
            }
            else view = ConvertView;
            return view;
        }


    }

}
