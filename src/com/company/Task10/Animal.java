package com.company.Task10;

public class Animal {
    public int width;
    public int height;
    public String animalName;
    public String animalSound;
    public int numberOfLegs;
    public String type;

    {
        animalName = "Animal";
        animalSound = "a";
        type = "any";
        this.width = 0;
        this.height = 0;
    }

    Animal() { }

    Animal(int width, int height, String animalName, int numberOfLegs, String type){
        this.width = width;
        this.height = height;
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

    public void sound(){
        System.out.println(animalSound + " " + animalSound);
    }

    public void move(){
        System.out.println("The " + animalName + " is moving");
    }

    public void showInfo(){
        System.out.println("~~~~~" + animalName + "~~~~~");
        System.out.println("Sound:" + animalSound);
        System.out.println("Number of legs:" + numberOfLegs);
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Type: " + type);

    }
}
