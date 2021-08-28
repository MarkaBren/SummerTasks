package com.company.Task11.Shape;

public class Circle11 extends Shape {

    public int RADIUS;

    {
        super.area = (int) Math.PI * RADIUS * RADIUS;
        super.description = "The circle is round around a point";
    }

    Circle11(int radius){
        this.RADIUS = radius;
    }

}
