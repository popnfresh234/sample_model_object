package com.dmtaiwan.alex.modelobjectsample.models;

import android.content.Context;

import com.dmtaiwan.alex.modelobjectsample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 8/15/2016.
 */
public class VegetableFactory {

    //Static factory method to create a list of vegetables
    public static List<Vegetable> GetVegetables(Context context) {
        List<Vegetable> vegetableList =new ArrayList<Vegetable>();

        Vegetable beanSprout = new Vegetable(context.getString(R.string.bean_sprout), context.getString(R.string.bean_sprout_sci), R.drawable.beansprout);
        vegetableList.add(beanSprout);

        Vegetable broccoli = new Vegetable(context.getString(R.string.broccoli), context.getString(R.string.broccoli_sci), R.drawable.broccoli);
        vegetableList.add(broccoli);

        Vegetable brownOnion = new Vegetable(context.getString(R.string.brown_onion), context.getString(R.string.brown_onion_sci), R.drawable.brown_onion);
        vegetableList.add(brownOnion);

        Vegetable carrot = new Vegetable(context.getString(R.string.carrot), context.getString(R.string.carrot_sci), R.drawable.carrot);
        vegetableList.add(carrot);

        Vegetable daikon = new Vegetable(context.getString(R.string.daikon), context.getString(R.string.daikon_sci), R.drawable.daikon);
        vegetableList.add(daikon);

        Vegetable onion = new Vegetable(context.getString(R.string.onion), context.getString(R.string.onion_sci), R.drawable.onion);
        vegetableList.add(onion);

        Vegetable potato = new Vegetable(context.getString(R.string.potato), context.getString(R.string.potato_sci), R.drawable.potato);
        vegetableList.add(potato);

        Vegetable romaine = new Vegetable(context.getString(R.string.romaine), context.getString(R.string.romaine_sci), R.drawable.romaine);
        vegetableList.add(romaine);

        return vegetableList;
    }
}
