package com.example.android.quakereport;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.

        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();

        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakes);

        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        earthquakeListView.setAdapter(earthquakeAdapter);
    }
}
