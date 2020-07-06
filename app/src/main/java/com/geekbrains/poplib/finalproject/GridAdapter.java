package com.geekbrains.poplib.finalproject;

import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter {

    private static final String TAG = "GridAdapter";
    ArrayList <Image> imagesList;
    int counter;

//    public GridAdapter(ArrayList <Image> imagesList) {
//        this.imagesList = imagesList;
//    }

    public GridAdapter() {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_recycler_card, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final ImageView imageView = holder.itemView.findViewById(R.id.recyclerImgView);
        imageView.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        LinearLayout cardView;

        public MyViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.recyclerImgView);
            cardView = itemView.findViewById(R.id.recycler_card);
            imageView.setOnClickListener(v -> {
                counter++;
                Log.d(TAG, "каунтер стал "+ counter);
            });
        }
    }

}
