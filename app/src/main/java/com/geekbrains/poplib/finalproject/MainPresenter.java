package com.geekbrains.poplib.finalproject;

import android.util.Log;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter <MainView> {
    private static final String TAG = "MainPresenter";

    private MainModel mainModel;

    public MainPresenter(){
        Log.d(TAG, "created");

    }

    public void increaseCounter(){
        int counter = mainModel.getCounter();
        counter++;
        mainModel.setCounter(counter);
        getViewState().setCounter(counter);
    }
}
