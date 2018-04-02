package com.example.android.sandiegotourapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arturoahernandez on 9/18/17.
 */

public class TourDescriptionAdapter extends ArrayAdapter<TourDescription> {
    public TourDescriptionAdapter(Context context, ArrayList<TourDescription> tourDescription) {
        super(context,0, tourDescription);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //save the view in listItemView
        View listItemView = convertView;

        //inflate view if null
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get tour item position
        TourDescription tour_item = getItem(position);

        //Find the textview in list_item with id name_text
        TextView nameText = (TextView) listItemView.findViewById(R.id.name_text);
        //set text to nameText
        nameText.setText(tour_item.getmName());

        //Find textview in list_item with id city_data_text, if getmCity == null return date, vice versa
        TextView cityDateText = (TextView) listItemView.findViewById(R.id.city_date_text);
        if(tour_item.getmCity() == null) {
            cityDateText.setText(tour_item.getmDate());
        } else {
            cityDateText.setText(tour_item.getmCity());
        }

        //Find textview in list_item with id website_text
        TextView websiteText = (TextView) listItemView.findViewById(R.id.website_text);
        //set website_text to wesbiteText
        websiteText.setText(tour_item.getmWebsite());

        //Find textview in list_item with id description_text
        TextView descriptionText = (TextView) listItemView.findViewById(R.id.description_text);
        //set description_text to descriptionText
        descriptionText.setText(tour_item.getmDescription());

        //Find image view in list)item with id image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //set image to imageView
        imageView.setImageResource(tour_item.getmImageResourceID());

        return listItemView;
    }

}
