package com.example.newsmth;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumbersRVAdapter extends RecyclerView.Adapter<NumbersRVAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, null);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String numberStr = position + 1 + "";
        TextView textView = holder.textView;
        textView.setText(numberStr);
        if(numberStr.contains("3")){
            textView.setTextSize(30);
            textView.setTextColor(Color.RED);
        } else {
            textView.setTextSize(20);
            textView.setTextColor(Color.BLACK);
        }

    }

    @Override
    public int getItemCount() {
        return 10000;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.textView2);
        }
    }
}
