package com.example.a15017470.c347_p02;

import android.media.Image;

/**
 * Created by 15017470 on 25/4/2017.
 */

public class Holiday {

    String name;
    String date;
    String image;

    public Holiday(String name, String date, String image){
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getImage() {return image;}

}
