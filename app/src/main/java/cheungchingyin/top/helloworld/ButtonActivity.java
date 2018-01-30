package cheungchingyin.top.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mbtn_3;
    private TextView mtv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbtn_3=findViewById(R.id.btn_3);
        mbtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//btn3onclick方法，常用
                Toast.makeText(ButtonActivity.this,"测试测试测试测试测试",Toast.LENGTH_SHORT).show();
            }
        });
        mtv8=findViewById(R.id.tv_8);
        mtv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"TextVew8被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void showToast(View view){//btn4的onclick方法
        Toast.makeText(this,"你好你好你好你好你好你好",Toast.LENGTH_SHORT).show();
    }
}
