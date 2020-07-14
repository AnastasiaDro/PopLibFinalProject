package com.geekbrains.poplib.finalproject;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class MainModel {

    //изображения
    ImageView imageView;
    //счётчик нажатий
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ArrayList<ImageView> getExampleList() {
        return exampleList;
    }

    //Картинки
    ArrayList exampleList = new ArrayList();

    public MainModel() {
        takeImages();
    }

//для примера заполним наш массив изображениями
    public void takeImages() {
        imageView.setImageResource(R.mipmap.ic_launcher);
        for (int i = 0; i < 10; i++) {
            exampleList.add(imageView);
        }
    }
}