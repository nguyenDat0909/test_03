package com.example.test_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private List<String> countrylist;
    private LayoutInflater mInflater;

    public MyAdapter(Context context, List<String> list) {
        mInflater = LayoutInflater.from(context);
        countrylist = list;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = mInflater.inflate(
                R.layout.country_layout,
                parent,
                false
        );

        return new CountryViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(
            @NonNull CountryViewHolder holder,
            int position) {

        holder.tid.setText(String.valueOf(position + 1));
        holder.tcountry.setText(countrylist.get(position));
    }

    @Override
    public int getItemCount() {
        return countrylist.size();
    }
}