package com.ozzyozdil.landmarkbookjava;

import java.io.Serializable;

public class Landmark implements Serializable {

    private String name;
    private String country;
    private int image;

    // Constructor
    public Landmark (String name, String country, int image){

        this.setName(name);
        this.setImage(image);
        this.setCountry(country);
    }


    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
