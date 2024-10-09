package com.example.chesswithrecview;

import android.graphics.Bitmap;

public class Stone {
    private String name;
    private int img;
    public Stone(){}
    public Stone(String name) { this.name = name;}
    public String getName() {  return name;}

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }


}
