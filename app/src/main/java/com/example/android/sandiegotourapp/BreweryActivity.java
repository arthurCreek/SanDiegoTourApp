package com.example.android.sandiegotourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by arturoahernandez on 9/18/17.
 */

public class BreweryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content view to the word_list layout
        setContentView(R.layout.word_list);

        //Create an array list of TourDescription objects
        ArrayList<TourDescription> tourDescription = new ArrayList<TourDescription>();
        tourDescription.add(new TourDescription(getString(R.string.name_alesmith) + " - ",
                getString(R.string.city_alesmith), null, getString(R.string.website_alesmith),
                getString(R.string.popular_alesmith), R.drawable.alesmithbrewing));
        tourDescription.add(new TourDescription(getString(R.string.name_alpine) + " - ",
                getString(R.string.city_alpine), null, getString(R.string.website_alpine),
                getString(R.string.popular_alpine), R.drawable.alpinebeercompany));
        tourDescription.add(new TourDescription(getString(R.string.name_societe) + " - ",
                getString(R.string.city_societe), null, getString(R.string.website_societe),
                getString(R.string.popular_societe), R.drawable.societebrewing));
        tourDescription.add(new TourDescription(getString(R.string.name_pizza) + " - ",
                getString(R.string.city_pizza), null, getString(R.string.website_pizza),
                getString(R.string.popular_pizza), R.drawable.pizzaport));
        tourDescription.add(new TourDescription(getString(R.string.name_karl_strauss) + " - ",
                getString(R.string.city_karl_strauss), null, getString(R.string.website_karl_strauss),
                getString(R.string.popular_karl_strauss), R.drawable.karlstrauss));
        tourDescription.add(new TourDescription(getString(R.string.name_stone) + " - ",
                getString(R.string.city_stone), null, getString(R.string.website_stone),
                getString(R.string.popular_stone), R.drawable.stonebrewing));
        tourDescription.add(new TourDescription(getString(R.string.name_ballast_point) + " - ",
                getString(R.string.city_ballast_point), null, getString(R.string.website_ballast_point),
                getString(R.string.popular_ballast_point), R.drawable.ballastpoint));
        tourDescription.add(new TourDescription(getString(R.string.name_lost_abbey) + " - ",
                getString(R.string.city_lost_abbey), null, getString(R.string.website_lost_abbey),
                getString(R.string.popular_lost_abbey), R.drawable.thelostabbey));
        tourDescription.add(new TourDescription(getString(R.string.name_coronado) + " - ",
                getString(R.string.city_coronado), null, getString(R.string.website_coronado),
                getString(R.string.popular_coronado), R.drawable.coronadobrewing));
        tourDescription.add(new TourDescription(getString(R.string.name_green_flash) + " - ",
                getString(R.string.city_green_flash), null, getString(R.string.website_green_flash),
                getString(R.string.popular_green_flash), R.drawable.greenflash));

        //Create adapter instance and add tour descriptions
        TourDescriptionAdapter adapter = new TourDescriptionAdapter(this, tourDescription);

        //Find the list view using the id
        ListView listView = (ListView) findViewById(R.id.list);

        //set the adapter to the listview
        listView.setAdapter(adapter);

    }
}
