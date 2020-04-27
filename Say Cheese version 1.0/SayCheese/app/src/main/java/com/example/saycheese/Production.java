package com.example.saycheese;

import androidx.annotation.NonNull;

public class Production {
    private String title;
    private String info;
    private int imageId;

    public Production(String title, String info, int imageId) {
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
