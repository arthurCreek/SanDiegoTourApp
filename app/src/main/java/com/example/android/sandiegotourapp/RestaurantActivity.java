package com.example.android.sandiegotourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by arturoahernandez on 9/18/17.
 */

public class RestaurantActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content view to the word_list layout
        setContentView(R.layout.word_list);

        //Create an array list of TourDescription objects
        ArrayList<TourDescription> tourDescription = new ArrayList<TourDescription>();
        tourDescription.add(new TourDescription(getString(R.string.name_phils_bbq) + " - ",
                getString(R.string.city_phils_bbq), null, getString(R.string.website_phils_bbq),
                getString(R.string.popular_phils_bbq), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_chart_house) + " - ",
                getString(R.string.city_chart_house), null, getString(R.string.website_chart_house),
                getString(R.string.popular_chart_house), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_cucina_urbana) + " - ",
                getString(R.string.city_cucina_urbana), null, getString(R.string.website_cucina_urbana),
                getString(R.string.popular_cucina_urbana), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_urban_solace) + " - ",
                getString(R.string.city_urban_solace), null, getString(R.string.website_urban_solace),
                getString(R.string.popular_urban_solace), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_cicciottis) + " - ",
                getString(R.string.city_cicciottis), null, getString(R.string.website_cicciottis),
                getString(R.string.popular_cicciottis), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_mission) + " - ",
                getString(R.string.city_mission), null, getString(R.string.website_mission),
                getString(R.string.popular_mission), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_emilianos) + " - ",
                getString(R.string.city_emilianos), null, getString(R.string.website_emilianos),
                getString(R.string.popular_emilianos), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_cafe_gratitude) + " - ",
                getString(R.string.city_cafe_gratitude), null, getString(R.string.website_cafe_gratitude),
                getString(R.string.popular_cafe_gratitude), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_great_maple) + " - ",
                getString(R.string.city_great_maple), null, getString(R.string.website_great_maple),
                getString(R.string.popular_great_maple), R.drawable.food));
        tourDescription.add(new TourDescription(getString(R.string.name_costa_brava) + " - ",
                getString(R.string.city_costa_brava), null, getString(R.string.website_costa_brava),
                getString(R.string.popular_costa_brava), R.drawable.food));

        //Create an instance of a new adapter
        TourDescriptionAdapter adapter = new TourDescriptionAdapter(this, tourDescription);

        //Get the view id of the list
        ListView listView = (ListView) findViewById(R.id.list);

        //set the adapter on the listview
        listView.setAdapter(adapter);

    }
}
