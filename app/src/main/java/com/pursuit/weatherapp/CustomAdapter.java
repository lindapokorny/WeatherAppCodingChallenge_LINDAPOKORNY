package com.pursuit.weatherapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private CustomViewHolder holder;
    private int position;

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder() {
        onBindViewHolder(, );
    }

    @Override
    public void onBindViewHolder(CustomAdapter.CustomViewHolder holder, int position) {

        this.holder = holder;
        this.position = position;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        this.holder = holder;
        this.position = position;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public CustomViewHolder(View itemView) {
            super(itemView);
        }
    }
}