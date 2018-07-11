package com.morse.livedatademo;

import com.morse.mvplibrary.mvp.BasePresenter;

public class MainPresenter extends BasePresenter<MainView> {

    private MainModel mainModel;

    public MainPresenter() {
        mainModel = new MainModel();
    }

    public String getTest() {
        return mainModel.test();
    }

}
