package com.example.crudfirebase.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crudfirebase.Holder.RecylerViewHolders;
import com.example.crudfirebase.Model.Task;
import com.example.crudfirebase.R;

import java.util.List;

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewHolders> {

    private List<Task> task;
    private Context context;

    public RecylerViewAdapter(Context context, List<Task> task ) {
        this.task = task;
        this.context = context;
    }

    @NonNull
    @Override
    public RecylerViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecylerViewHolders recylerViewHolders = null;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_list, parent, false);
        recylerViewHolders = new RecylerViewHolders(layoutView, task);
        return  recylerViewHolders;
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerViewHolders holder, int position) {
        holder.categoryTitle.setText(task.get(position).getTask());
    }

    @Override
    public int getItemCount() {
        return this.task.size();
    }
}
