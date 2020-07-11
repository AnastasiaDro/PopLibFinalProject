package com.geekbrains.poplib.finalproject.photorecycler;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import moxy.viewstate.strategy.alias.AddToEndSingle;

public interface GridView extends MvpView {
    @StateStrategyType(value = AddToEndSingleStrategy.class)
}
