//Name- Aditya Roy  Roll - 2004003
package com.example.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vacationtourapp.adapter.RecentsAdapter;
import com.example.vacationtourapp.adapter.TopPlacesAdapter;
import com.example.vacationtourapp.model.RecentsData;
import com.example.vacationtourapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now here we will add some dummy data in our model class

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Los angles","India","From $200",R.drawable.losanglespic));
        recentsDataList.add(new RecentsData("France","India","From $300",R.drawable.francepic));
        recentsDataList.add(new RecentsData("Warsaw","India","From $200",R.drawable.warsawpic));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kashmir","India","$200 - $500",R.drawable.kashmirpic));
        topPlacesDataList.add(new TopPlacesData("Shimla","India","$150 - $300",R.drawable.shimlapic));
        topPlacesDataList.add(new TopPlacesData("Rajasthan","India","$250 - $300",R.drawable.rajashthanpic));
        topPlacesDataList.add(new TopPlacesData("Bangalore","India","$350 - $490",R.drawable.bangalorepic));
        topPlacesDataList.add(new TopPlacesData("Kolkata","India","$120 - $500",R.drawable.kolkatapic));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }

}
