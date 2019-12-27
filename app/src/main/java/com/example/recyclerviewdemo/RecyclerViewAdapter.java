package com.example.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHoler> {

    private ArrayList<String> data;
    private ArrayList<Integer> dataImages;

    public RecyclerViewAdapter(ArrayList<String> data, ArrayList<Integer> dataImages) {
        this.data = data;
        this.dataImages = dataImages;
    }

    @NonNull
    @Override
    public RecyclerViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View itemView = inflater.inflate(R.layout.list_layout_item, parent, false);

        return new RecyclerViewHoler(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHoler holder, int position) {

        String title = data.get(position);
        holder.tvTitle.setText(title);

        Integer imageShow = dataImages.get(position);
        holder.ivIcon.setImageResource(imageShow);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class RecyclerViewHoler extends RecyclerView.ViewHolder {

        ImageView ivIcon;
        TextView tvTitle;

        public RecyclerViewHoler(@NonNull View itemView) {
            super(itemView);

            ivIcon = itemView.findViewById(R.id.imageIcon);
            tvTitle = itemView.findViewById(R.id.textTitle);
        }
    }

}
