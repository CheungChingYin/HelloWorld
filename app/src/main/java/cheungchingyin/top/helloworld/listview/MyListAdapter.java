package cheungchingyin.top.helloworld.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import cheungchingyin.top.helloworld.R;

/**
 * Created by 张正贤 on 2018/3/7.
 */

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mlayoutInflater;

    public MyListAdapter(Context context){
        this.mContext=context;
        mlayoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }//需要多少条List

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=mlayoutInflater.inflate(R.layout.layout_list_item,null);//应用list_item的样式
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.iv);
            holder.tvTitle=convertView.findViewById(R.id.tv_title);
            holder.tvTime=convertView.findViewById(R.id.tv_time);
            holder.tvContent=convertView.findViewById(R.id.content);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("2088-08-08");
        holder.tvContent.setText("这是内容");
        Glide.with(mContext).load("https://www.baidu.com/img/bd_logo1.png").into(holder.imageView);
        return convertView;
    }

    static class ViewHolder{//控件
        ImageView imageView;
        TextView tvTitle,tvTime,tvContent;
    }
}
