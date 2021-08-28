package com.company.Task11.ClassWars;

public class CombatVehicle {

    private int attackDamage;
    private int protection;
    private int health = 100;
    protected String name = "";

    CombatVehicle(){

    }

    public void setAttackAndProtection(int attackDamage, int protection){
        this.setAttackDamage(attackDamage);
        this.setProtection(protection);
    }

    public int getAttackDamage(){
        return attackDamage;
    }

    public void setAttackDamage(int damage){
        this.attackDamage = damage;
    }

    public int getProtection(){
        return protection;
    }

    public void setProtection(int protection){
        this.protection = protection;
    }

    public int getHealth(){
        return protection;
    }

    public boolean isDestroyed () {
        return health == 0;
    }

    public void showInfo() {
        System.out.println("**********************************************************");
        System.out.println("The health of the " + this.name + " is " + this.getHealth());
        System.out.println("The attack damage is " + this.getAttackDamage());
        System.out.println("The protection level is " + this.getProtection());
        System.out.println("**********************************************************");
    }

    public int attack() {
        return attackDamage;
    }

    public int defence(int damage) {
        return damage - protection;
    }

    public void reduceHealth(int damage) {
        health -= defence(damage);
    }

}
