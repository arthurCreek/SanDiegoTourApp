package com.example.android.sandiegotourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //These create textviews by their respective ids
        TextView brewery = (TextView) findViewById(R.id.brewery);
        TextView restaurant = (TextView) findViewById(R.id.restaurant);
        TextView to_do = (TextView) findViewById(R.id.to_do);
        final TextView festivals = (TextView) findViewById(R.id.festivals);

        //These set up setOnClickListener for each textview
        brewery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent breweryIntent = new Intent(MainActivity.this, BreweryActivity.class);
                startActivity(breweryIntent);
            }
        });

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

        to_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDoIntent = new Intent(MainActivity.this, ToDoActivity.class);
                startActivity(toDoIntent);
            }
        });

        festivals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalsIntent = new Intent(MainActivity.this, FestivalsActivity.class);
                startActivity(festivalsIntent);
            }
        });
    }
}
