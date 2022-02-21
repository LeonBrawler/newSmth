package com.example.newsmth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultAdapter extends BaseAdapter {

    ArrayList<Integer> results = new ArrayList<>();
    Context context;

    public ResultAdapter(Context context, ArrayList<Integer> results) {
        this.results = results;
        this.context = context;
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return results.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint({"SetTextI18n", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        class ViewHolder{
            TextView textView;

            public ViewHolder(TextView textView) {
                this.textView = textView;
            }
        }
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, null);
            TextView tv = convertView.findViewById(android.R.id.text1);
            convertView.setTag(new ViewHolder(tv));
        }
        TextView nameTV = ((ViewHolder)(convertView.getTag())).textView;
        nameTV.setText(results.get(position)+"");
        if(results.get(position).toString().contains("3")){
            nameTV.setTextColor(Color.RED);
        } else {
            nameTV.setTextColor(Color.BLACK);
        }
        return convertView;
    }
}
