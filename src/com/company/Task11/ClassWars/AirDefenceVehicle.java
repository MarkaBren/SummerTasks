package com.company.Task11.ClassWars;

public class AirDefenceVehicle  extends CombatVehicle {

    private int range;
    private int shootSpeed;
    private int mobility;
    private int appliedDamage =  (150 + range * (shootSpeed / 10));
    private int healthLoss = super.getAttackDamage() / mobility;

    AirDefenceVehicle(int range, int shootSpeed, int mobility){
        this.range = range;
        this.shootSpeed = shootSpeed;
        this.mobility = mobility;

        super.name = "Air Defence Vehicle";
    }

}
