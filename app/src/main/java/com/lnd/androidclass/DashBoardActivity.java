package com.lnd.androidclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lnd.androidclass.adapters.DashBoardAdapter;
import com.lnd.androidclass.models.ListModel;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListModel> list = new ArrayList<>();
        list.add(new ListModel("Android Life Cycle"));
        list.add(new ListModel("Add Two Numbers"));

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        DashBoardAdapter dashBoardAdapter = new DashBoardAdapter(this,list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(dashBoardAdapter);
    }
}