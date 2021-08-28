package com.company.Task11.ClassWars;

public class CombatVehicle {

    private int attackDamage;
    private int protection;
    private int health = 100;


    CombatVehicle(){

    }

    CombatVehicle(int attackDamage, int protection){
        this.attackDamage = attackDamage;
        this.protection = protection;
    }

    public boolean isDestroyed () {
        return health == 0;
    }

    public void showInfo () {

    }

    public int attack() {
        return attackDamage;
    }

    public int defence(int damage) {
        return damage - protection;
    }

}
