package com.dmtaiwan.alex.modelobjectsample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dmtaiwan.alex.modelobjectsample.R;
import com.dmtaiwan.alex.modelobjectsample.adapter.VegetableAdapter;
import com.dmtaiwan.alex.modelobjectsample.models.Vegetable;
import com.dmtaiwan.alex.modelobjectsample.models.VegetableFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private VegetableAdapter mVegetableAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Vegetable> mVegetableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mVegetableList = VegetableFactory.GetVegetables(this);

        mVegetableAdapter = new VegetableAdapter(this, mVegetableList);
        mRecyclerView.setAdapter(mVegetableAdapter);
    }
}
