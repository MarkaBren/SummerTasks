package com.company.Task11.ClassWars;

public class Tank extends CombatVehicle {

    private int reloadTime;
    private int shotAccuracy;
    private int armorThickness;
    private int appliedDamage = (100 * shotAccuracy / (reloadTime+1));
    private int healthLoss = appliedDamage - armorThickness;

    {

    }

    Tank(int reloadTime, int shotAccuracy, int armorThickness, String team){
        this.reloadTime = reloadTime;
        this.shotAccuracy = shotAccuracy;
        this.armorThickness = armorThickness;

        super.name = "Tank";
    }



}
