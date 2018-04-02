package com.example.android.sandiegotourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by arturoahernandez on 9/18/17.
 */

public class ToDoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content view to the word_list layout
        setContentView(R.layout.word_list);


        //Create an array list of TourDescription objects
        ArrayList<TourDescription> tourDescription = new ArrayList<TourDescription>();
        tourDescription.add(new TourDescription(getString(R.string.name_balboa_park) + " - ",
                getString(R.string.city_balboa_park), null, getString(R.string.website_balboa_park),
                getString(R.string.description_balboa_park), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_san_diego_zoo) + " - ",
                getString(R.string.city_san_diego_zoo), null, getString(R.string.website_san_diego_zoo),
                getString(R.string.description_san_diego_zoo), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_seaworld) + " - ",
                getString(R.string.city_seaworld), null, getString(R.string.website_seaworld),
                getString(R.string.description_seaworld), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_old_town) + " - ",
                getString(R.string.city_old_town), null, getString(R.string.website_old_town),
                getString(R.string.description_old_town), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_seaport_village) + " - ",
                getString(R.string.city_seaport_village), null, getString(R.string.website_seaport_village),
                getString(R.string.description_seaport_village), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_torrey_pines) + " - ",
                getString(R.string.city_torrey_pines), null, getString(R.string.website_torrey_pines),
                getString(R.string.description_torrey_pines), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_air_and_space) + " - ",
                getString(R.string.city_air_and_space), null, getString(R.string.website_air_and_space),
                getString(R.string.description_air_and_space), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_cabrillo) + " - ",
                getString(R.string.city_cabrillo), null, getString(R.string.website_cabrillo),
                getString(R.string.description_cabrillo), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_uss_midway) + " - ",
                getString(R.string.city_uss_midway), null, getString(R.string.website_uss_midway),
                getString(R.string.description_uss_midway), R.drawable.activity));
        tourDescription.add(new TourDescription(getString(R.string.name_legoland) + " - ",
                getString(R.string.city_legoland), null, getString(R.string.website_legoland),
                getString(R.string.description_legoland), R.drawable.activity));

        //Make a new instance of TourDescriptionAdapter
        TourDescriptionAdapter adapter = new TourDescriptionAdapter(this, tourDescription);

        //Set the list view id on listView
        ListView listView = (ListView) findViewById(R.id.list);

        //set adapter on listView
        listView.setAdapter(adapter);
    }
}
