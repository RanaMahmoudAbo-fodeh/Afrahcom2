package com.example.afrahcom;

public class post {
    String name;
    String describtion ;
    int img,imgmain;

    public post() {
    }

    public post(String name, String describtion, int img, int imgmain) {
        this.name = name;
        this.describtion = describtion;
        this.img = img;
        this.imgmain = imgmain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImgmain() {
        return imgmain;
    }

    public void setImgmain(int imgmain) {
        this.imgmain = imgmain;
    }
}
