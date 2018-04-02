package com.example.android.sandiegotourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by arturoahernandez on 9/18/17.
 */

public class FestivalsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content view to the word_list layout
        setContentView(R.layout.word_list);

        //Create an array list of TourDescription objects
        ArrayList<TourDescription> tourDescription = new ArrayList<TourDescription>();
        tourDescription.add(new TourDescription(getString(R.string.name_san_diego_brew_festival) + " - ", null,
                getString(R.string.date_san_diego_brew_festival), getString(R.string.website_san_diego_brew_festival),
                getString(R.string.description_san_diego_brew_festival), R.drawable.festival));
        tourDescription.add(new TourDescription(getString(R.string.name_oysterfest)+ " - ", null,
                getString(R.string.date_oysterfest), getString(R.string.website_oysterfest),
                getString(R.string.description_oysterfest), R.drawable.festival));
        tourDescription.add(new TourDescription(getString(R.string.name_del_mar_festival)+ " - ", null,
                getString(R.string.date_del_mar_festival), getString(R.string.website_del_mar_festival),
                getString(R.string.description_del_mar_festival), R.drawable.festival));
        tourDescription.add(new TourDescription(getString(R.string.name_ob_festival)+ " - ", null,
                getString(R.string.date_ob_festival), getString(R.string.website_ob_festival),
                getString(R.string.description_ob_festival), R.drawable.festival));
        tourDescription.add(new TourDescription(getString(R.string.name_sun_and_sea_festival)+ " - ", null,
                getString(R.string.date_sun_and_sean_festival), getString(R.string.website_sun_and_sea_festival),
                getString(R.string.description_sun_and_sea_festival), R.drawable.festival));
        tourDescription.add(new TourDescription(getString(R.string.name_heroes_festival)+ " - ", null,
                getString(R.string.date_heroes_festival), getString(R.string.website_heroes_festival),
                getString(R.string.description_heroes_festival), R.drawable.festival));
        tourDescription.add(new TourDescription(getString(R.string.name_bacon_fest)+ " - ", null,
                getString(R.string.date_bacon_fest), getString(R.string.website_bacon_fest),
                getString(R.string.description_bacon_fest), R.drawable.festival));

        //Create a new instance of the TourDescriptionAdapter using tourDescription
        TourDescriptionAdapter adapter = new TourDescriptionAdapter(this, tourDescription);

        //Get the id of the list view
        ListView listView = (ListView) findViewById(R.id.list);

        //set the adapter on listView
        listView.setAdapter(adapter);

    }
}
