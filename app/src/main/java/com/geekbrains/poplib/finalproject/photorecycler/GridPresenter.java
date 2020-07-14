package com.geekbrains.poplib.finalproject.photorecycler;

import android.util.Log;

import com.geekbrains.poplib.finalproject.MainModel;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class GridPresenter extends MvpPresenter<GridView> {
     int counter;
    private static final String TAG = "GridPresenter";
    MainModel mainModel;

    public GridPresenter(){
        mainModel = new MainModel();
        counter = mainModel.getCounter();
    }

    public void increaseCounter() {
        int counter = mainModel.getCounter();
        counter++;
        mainModel.setCounter(counter);
        getViewState().setCounter(counter);
        Log.d(TAG, "каунтер стал "+ counter);
    }

    public int getItemCount(){
        return mainModel.getExampleList().size();
    }

    public void onBindImageViewAtPosition(int position, GridView myView) {

        image = repositories.get(position);
        rowView.setStarCount(repo.getStarsCount());
        rowView.setTitle(repo.getTitle());
    }

}
