package com.example.easybook;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("f1WRyKNQ50x3JkTcyjref8fF8EWerdxQI4pOaaEz")
                // if defined
                .clientKey("2cmAYTVKdy344jPH1MSVlz4BhOOqPXiouQrgL6ll")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
