package com.example.android.sandiegotourapp;


/**
 * Created by arturoahernandez on 9/18/17.
 */

public class TourDescription {
    //Variables for the TourDescription class
    private String mName, mCity, mDate, mWebsite, mDescription;
    private int mImageResourceID;

    //public constructor for Tour description
    public TourDescription(String mName, String mCity, String mDate, String mWebsite, String mDescription, int mImageResourceID) {
        this.mName = mName;
        this.mCity = mCity;
        this.mDate = mDate;
        this.mWebsite = mWebsite;
        this.mDescription = mDescription;
        this.mImageResourceID = mImageResourceID;
    }

    //Static TourDescription with date
    public static TourDescription fromNameWebsiteDateDescription(String mName, String mDate, String mWebsite, String mDescription, int mImageResourceID) {
        return new TourDescription(mName, null, mDate, mWebsite, mDescription, mImageResourceID);
    }

    //Static TourDescription with city
    public static TourDescription fromNameCityWebsiteDateDescription(String mName, String mCity, String mWebsite, String mDescription, int mImageResourceID){
        return new TourDescription(mName, mCity, null, mWebsite, mDescription, mImageResourceID);
    }

    //Getters for each variable
    public String getmName() {
        return mName;
    }

    public String getmCity() {
        return mCity;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
