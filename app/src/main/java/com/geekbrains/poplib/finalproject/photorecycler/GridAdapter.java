package com.geekbrains.poplib.finalproject.photorecycler;

import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geekbrains.poplib.finalproject.MainPresenter;
import com.geekbrains.poplib.finalproject.R;

import java.util.ArrayList;

import moxy.presenter.InjectPresenter;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.MyViewHolder>  {

    private static final String TAG = "GridAdapter";

    @InjectPresenter
    GridPresenter gridPresenter;

    public GridAdapter() {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_recycler_card, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ImageView imageView = holder.itemView.findViewById(R.id.recyclerImgView);
        gridPresenter.onBindImageViewAtPosition(position, holder);
        //изображение должно браться в другом месте, из презентера
        imageView.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return gridPresenter.getItemCount();
    }

//    @Override
//    public void setCounter(int counter) {
//        //что-то изменяется
//        Log.d(TAG, "counter стал " + counter);
//    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements GridView {
        public ImageView imageView;
        LinearLayout cardView;

        public MyViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.recyclerImgView);
            cardView = itemView.findViewById(R.id.recycler_card);
            imageView.setOnClickListener(v -> {
                gridPresenter.increaseCounter();
            });
        }

        @Override
        public void setCounter(int counter) {
            Log.d(TAG, "counter стал " + counter);
        }

        @Override
        public void setImage() {

        }
    }


}
