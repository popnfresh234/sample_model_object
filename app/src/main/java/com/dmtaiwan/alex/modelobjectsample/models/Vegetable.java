package com.dmtaiwan.alex.modelobjectsample.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Alex on 8/15/2016.
 */
public class Vegetable implements Parcelable {

    //Variables to hold model information
    private String mName;
    private String mScientificName;
    private int mImgRes;


    //Constructor to create vegetable and set information
    public Vegetable(String name, String scientificName, int imgRes) {
        mName = name;
        mScientificName = scientificName;
        mImgRes = imgRes;
    }

    //Getters and Setters for easy access to model information
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImgRes() {
        return mImgRes;
    }

    public void setImgRes(int imgRes) {
        mImgRes = imgRes;
    }

    public String getScientificName() {
        return mScientificName;
    }

    public void setScientificName(String scientificName) {
        mScientificName = scientificName;
    }

    //Parcelable implementation so model object can be attached to an Intent as an extra
    protected Vegetable(Parcel in) {
        mName = in.readString();
        mScientificName = in.readString();
        mImgRes = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeString(mScientificName);
        dest.writeInt(mImgRes);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Vegetable> CREATOR = new Parcelable.Creator<Vegetable>() {
        @Override
        public Vegetable createFromParcel(Parcel in) {
            return new Vegetable(in);
        }

        @Override
        public Vegetable[] newArray(int size) {
            return new Vegetable[size];
        }
    };
}