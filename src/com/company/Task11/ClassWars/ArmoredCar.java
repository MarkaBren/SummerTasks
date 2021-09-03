package com.company.Task11.ClassWars;

public class ArmoredCar  extends CombatVehicle {

    private int weaponCount;
    private int velocity;
    private int appliedDamage = 50 * weaponCount;
    private int healthLoss = super.getAttackDamage() - velocity/2;


    ArmoredCar(int weaponCount, int velocity, String team){
        this.weaponCount = weaponCount;
        this.velocity = velocity;

        super.name = "Armored Car";
    }

}
