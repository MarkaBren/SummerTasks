package com.company;

public class Tasks8 {

    public static void main(String[] args){
        Circle c = new Circle(5);
        c.print();
        c.Show();
        Circle c2 = new Circle(6);
        c.print();
        c.Show();
        System.out.println("Number of circles is " + Circle.getCount());

        Conditioner conditioner = new Conditioner();
        conditioner.turnOnOff();
        conditioner.show("State");
        conditioner.turnOnOff();
        conditioner.show("State");
    }

}

class Conditioner {

    public String model = "Good";
    public int mode = 0;
    public int current = 20;
    public int power = 20;
    public int temperature = 20;
    public boolean state = false;

    Conditioner(){
        state = false;
    }

    Conditioner(String model, int mode, int current, int power, int temperature){
        this.model = model;
        this.mode = mode;
        this.current = current;
        this.power = power;
        this.temperature = temperature;
    }

    public void show(String prop){
        switch(prop){
            case "Temperature":
                System.out.println("The temperature is " + temperature);
            break;
            case "State":
                System.out.println("The air conditioner is " + (state ? "on" : "off" ));
            break;
            case "Power":
                System.out.println("The power of air conditioner is " + power);
            break;
            case "Model":
                System.out.println("The model of air conditioner is " + model);
            break;
            case "Mode":
                System.out.println("The mode of air conditioner is " + mode);
            break;
            case "Current":
                System.out.println("The current of air conditioner is " + current);
            break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void turnOnOff(){
        state = !state;
    }

    public void changeMode(int newMode){
        if(newMode > 0 && newMode < 5) this.mode = newMode;
        else System.out.println("Invalid mode");
    }

    public void changeTemperature(int newTemperature){
        if(newTemperature > 5 && newTemperature < 24) temperature = newTemperature;
        else System.out.println("Invalid temperature");
    }

    public void changePower(int newPower){
        if(newPower > 0 && newPower < 100) power = newPower;
        else System.out.println("Invalid power");
    }



}

class Circle {
    public String c = "";
    private int radius;
    private static int count = 0;

    {
     ++count;
    }

    Circle(int r){
        this.radius = r;
    }

    public String print(){

        for (int i = 0; i <= radius * 2; i++) {
            for (int j = 0; j <= radius * 2; j++) {
                double dist = Math.sqrt((i-radius)*(i-radius) + (j-radius)*(j-radius));

                if(dist > radius - 0.5 && dist < radius + 0.5) c += "*";
                else c += " ";
            }
            c += "\n";
        }

        return c;
    }

    public static int getCount(){
        return count;
    }

    public int getRadius(){
        return radius;
    }

    public void ChangeSize(int newRadius){
        radius = newRadius;
    }

    public void Show(){
        System.out.println(c);
    }

    public int GetArea(){
        return (int) Math.PI * radius * radius;
    }

    public int GetPerimeter(){
        return (int) (2 * Math.PI * radius);
    }
}


