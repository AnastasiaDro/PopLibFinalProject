package com.geekbrains.poplib.finalproject.photorecycler;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;


public interface GridView extends MvpView {
    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setCounter(int counter);
    void setImage();
}
