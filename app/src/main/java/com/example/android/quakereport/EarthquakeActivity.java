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
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        earthquakes.add(new Earthquake(2.1, "San Fransisco", "12-01-2017"));
        earthquakes.add(new Earthquake(5.3, "London", "04-11-2018"));
        earthquakes.add(new Earthquake(8.0, "Tokyo", "19-03-2017"));
        earthquakes.add(new Earthquake(3.7, "Mexico City", "27-08-2019"));
        earthquakes.add(new Earthquake(6.2, "Moscow", "23-06-2016"));
        earthquakes.add(new Earthquake(2.5, "Rio de Janerio", "06-03-2015"));
        earthquakes.add(new Earthquake(4.9, "Paris", "17-09-2018"));

        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakes);

        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        earthquakeListView.setAdapter(earthquakeAdapter);
    }
}
