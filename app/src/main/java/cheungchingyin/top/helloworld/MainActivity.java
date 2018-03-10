package cheungchingyin.top.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import cheungchingyin.top.helloworld.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;//声明Button
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView =findViewById(R.id.btn_textview);
        mBtnButton =findViewById(R.id.btn_button);
        mBtnEditText=findViewById(R.id.btn_edittext);
        mBtnRadioButton=findViewById(R.id.btn_radiobutton);
        mBtnCheckBox=findViewById(R.id.btn_checkbox);
        mBtnImageView=findViewById(R.id.btn_imageview);
        mBtnListView=findViewById(R.id.btn_listview);
        setListeners();

    }
    private void setListeners(){
        OnClick onClick=new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    //跳转到TextView界面
                    intent=new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //跳转到Button界面
                    intent=new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到editText界面
                    intent=new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButton界面
                    intent=new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case  R.id.btn_checkbox:
                    //跳转到CheckBox界面
                    intent=new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case  R.id.btn_imageview:
                    //跳转到ImageView界面
                    intent=new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    //跳转到ListView界面
                    intent=new Intent(MainActivity.this, ListViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}


