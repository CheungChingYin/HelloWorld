package cheungchingyin.top.helloworld.listview;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import cheungchingyin.top.helloworld.R;

/**
 * Created by 张正贤 on 2018/3/7.
 */

public class ListViewActivity extends Activity {
    private ListView mlv_1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mlv_1 =findViewById(R.id.lv_1 );
        mlv_1.setAdapter(new MyListAdapter(ListViewActivity.this));
        mlv_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"点击 pos"+position,Toast.LENGTH_SHORT).show();
            }
        });
        mlv_1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"长按 pos"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
