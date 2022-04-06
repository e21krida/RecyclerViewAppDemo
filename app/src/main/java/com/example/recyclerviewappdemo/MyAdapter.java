package com.example.recyclerviewappdemo;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<String> mountains = Arrays.asList("Kinnekulle", "Billingen", "Matterhorn", "Kebnekaise", "Mount Everest");

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mountain, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(mountains.get(position));
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }
}
