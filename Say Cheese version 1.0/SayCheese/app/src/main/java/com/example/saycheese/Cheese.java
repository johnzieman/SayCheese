package com.example.saycheese;

import androidx.annotation.NonNull;

public class Cheese {
    private String title;
    private String info;
    private int imageId;

    public Cheese(String title, String info, int imageId) {
        this.title = title;
        this.info = info;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageId() {
        return imageId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
