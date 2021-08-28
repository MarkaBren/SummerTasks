package com.company.Task11.ClassWars.Vehicles;

import com.company.Task11.ClassWars.CombatVehicle;

public class Tank extends CombatVehicle {

    private int reloadTime;
    private int shotAccuracy;
    private int armorThickness;
    private int appliedDamage = (100 * shotAccuracy / reloadTime);
    private int health;

    Tank(){

    }

}
