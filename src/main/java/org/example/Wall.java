package org.example;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        this.width = 0.0;
        this.height = 0.0;
    }

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0 ) width = 0.0;
        this.width = width;
    }

    public void setHeight(double heigth){
        if(heigth < 0 ) heigth = 0.0;
        this.height = heigth;
    }

    public double getArea(){
        return width * height;
    }
}
