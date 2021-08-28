package com.company.Task11.Shape;

public class Rectangle extends Shape {

    public int a;
    public int b;
    public int c;
    public int d;
    public int alpha;
    public int betta;
    public int gamma;
    public int delta;

    {
        super.area = a * b;
        super.description = "The rectangle has four angels";
    }

    Rectangle(int a, int b, int c, int d, int alpha, int betta, int gamma, int delta){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.alpha = alpha;
        this.betta = betta;
        this.gamma = gamma;
        this.delta = delta;
    }

}
