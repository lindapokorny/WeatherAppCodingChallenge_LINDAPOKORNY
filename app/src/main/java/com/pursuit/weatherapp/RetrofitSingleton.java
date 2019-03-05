package com.pursuit.weatherapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitSingleton {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://api.aerisapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static Retrofit getInstance() {
        return getInstance();
    }
}
