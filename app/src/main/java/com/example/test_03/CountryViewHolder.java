package com.example.test_03;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder
        extends RecyclerView.ViewHolder
        implements View.OnClickListener {

    TextView tid;
    TextView tcountry;

    public CountryViewHolder(View item, MyAdapter adapter) {
        super(item);

        tid = item.findViewById(R.id.tid);
        tcountry = item.findViewById(R.id.tcountry);

        item.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String msg = tid.getText().toString()
                + " | "
                + tcountry.getText().toString();

        Toast.makeText(
                v.getContext(),
                msg,
                Toast.LENGTH_SHORT
        ).show();
    }
}