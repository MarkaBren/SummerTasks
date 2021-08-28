package com.company.Task11.Shape;

public class Triangle extends Shape {

    public int a;
    public int b;
    public int c;
    public int alpha;
    public int betta;
    public int gamma;

    {
        super.area = (int) a * b /2;
        super.description = "The triangle has four angels";
    }

    Triangle(int a, int b, int c, int alpha, int betta, int gamma){
        this.a =  a;
        this.b =  b;
        this.c =  c;
        this.alpha =  alpha;
        this.betta =  betta;
        this.gamma =  gamma;
    }

}
