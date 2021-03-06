package com.example.emilia.assignment_4;

import java.io.Serializable;
import android.graphics.drawable.Drawable;

/**
 * Created by Emilia on 23.4.2015.
 */
public class Planet implements Serializable {


    String name;
    Drawable image;
    String info;

    public Planet (String n, Drawable d, String i){
        this.name = n;
        this.image = d;
        this.info = i;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image){
        this.image = image;

    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        return info;

    }


}
