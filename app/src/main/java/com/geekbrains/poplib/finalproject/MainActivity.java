package com.geekbrains.poplib.finalproject;

import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.geekbrains.poplib.finalproject.photorecycler.GridAdapter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    RecyclerView recyclerView;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycler();
    }

    @InjectPresenter
    MainPresenter mainPresenter;

    @Override
    public void setCounter(int counter) {
        this.counter = counter;
    }

    private void initRecycler(){
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(layoutManager);
        GridAdapter gridAdapter = new GridAdapter();
        recyclerView.setAdapter(gridAdapter);
    }


}