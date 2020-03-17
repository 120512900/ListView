package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;

public class MyAdapter extends BaseAdapter {
    private Context mcontext;
    private String [] id=new String []{
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"
};
    private int[] image=new int[]{
           R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,R.drawable.a4,
            R.drawable.a5,R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a10
    };
    private LayoutInflater mLayoutInflater;
    public  MyAdapter(Context context){
        mcontext=context;
        mLayoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return id.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
static class ViewHolder
{
    public ImageView iv;
    public TextView textview;
}
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){

            convertView=mLayoutInflater.inflate(R.layout.item,null);
            holder=new ViewHolder();
            holder.iv=(ImageView)convertView.findViewById(R.id.iv);
            holder.textview=convertView.findViewById(R.id.item);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        //赋值;
        holder.textview.setText(id[position]);
        holder.iv.setImageResource(image[position%10]);
       // holder.iv.setImageDrawable();
        return convertView;
    }
}
