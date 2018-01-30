package cheungchingyin.top.helloworld;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnTextView=findViewById(R.id.btn_textview);
        BtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到TextView演示界面
                Intent intent=new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        BtnButton=findViewById(R.id.btn_button);
        BtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button界面
                Intent intent=new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
    }

    private Button BtnTextView;//声明Button
    private Button BtnButton;
}
