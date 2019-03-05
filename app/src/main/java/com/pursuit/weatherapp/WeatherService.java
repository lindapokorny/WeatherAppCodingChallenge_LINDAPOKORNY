package com.pursuit.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {

    @GET("forecasts/11101?client_id=QAfQNxHxiFL1pzM5Qb3MN&client_secret=RipFNzPipapb6Hc3wzDHrXtQPrk0gbt61JwSyFm4")
    Call<MyPojo> getSuccess();
}
