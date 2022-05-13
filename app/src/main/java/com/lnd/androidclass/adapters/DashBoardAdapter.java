package com.lnd.androidclass.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lnd.androidclass.DashBoardActivity;
import com.lnd.androidclass.R;
import com.lnd.androidclass.models.ListModel;
import com.lnd.androidclass.ui.AddTwoNumbersActivity;

import java.util.ArrayList;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.ViewHolder> {
    ArrayList<ListModel> listModels;

    Activity activity;
    public DashBoardAdapter(DashBoardActivity dashBoardActivity, ArrayList<ListModel> list) {
        this.listModels = list;
        this.activity = dashBoardActivity;
    }

    @NonNull
    @Override
    public DashBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull DashBoardAdapter.ViewHolder holder, int position) {
        holder.textView.setText(listModels.get(position).getStr_name());
        holder.itemView.setOnClickListener(view -> {
            if(listModels.get(position).getStr_name().equalsIgnoreCase("Android Life Cycle")){

            }else if(listModels.get(position).getStr_name().equalsIgnoreCase("Add Two Numbers")){
                activity.startActivity(new Intent(activity, AddTwoNumbersActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.tv_view);
        }
    }
}