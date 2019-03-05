package com.pursuit.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private TextView minTemp;
    private TextView maxTemp;
    private TextView date;
    private ImageView icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = RetrofitSingleton.getInstance();

        minTemp = findViewById(R.id.minTempF_text_view);
        maxTemp = findViewById(R.id.maxTempF_text_view);
        date = findViewById(R.id.date_iso_text_view);
        icon = findViewById(R.id.image_view);
        Call<MyPojo> call = retrofit.create(WeatherService.class).getSuccess()
                ;

        call.enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {

            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {

            }
        });

    }
}
