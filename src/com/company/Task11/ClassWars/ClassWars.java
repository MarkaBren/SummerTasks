package com.company.Task11.ClassWars;

import java.util.Random;

public class ClassWars {

    public CombatVehicle[] teamOneArmy;
    public CombatVehicle[] teamTwoArmy;
    public String winningTeam;

    public Random r = new Random();


    public int maxTankReloadTime = 50;
    public int maxTankShotAccuracy = 25;
    public int maxTankArmorThickness = 50;

    public int maxCarWeaponCount = 100;
    public int maxCarVelocity = 25;

    public int maxAirDefenceRange = 100;
    public int maxAirDefenceShootSpeed = 25;
    public int maxAirDefenceMobility = 10;


    public int maxAttackDamage = 10;
    public int maxProtection = 50;

    {
        teamOneArmy = new CombatVehicle[5 + r.nextInt(5)];
        teamTwoArmy = new CombatVehicle[5 + r.nextInt(5)];
    }

    ClassWars(){

    }

    public void startGame(){
        while (!isEndOfGame()){
            round(teamOneArmy, teamTwoArmy);
        }
    }

    public void round(CombatVehicle[] one, CombatVehicle[] two){

        int oneRandVehicle = r.nextInt(one.length), twoRandVehicle = r.nextInt(two.length);
        two[twoRandVehicle].reduceHealth(one[oneRandVehicle].attack());
        one[oneRandVehicle].reduceHealth(two[twoRandVehicle].attack());
        one[oneRandVehicle].showInfo();
        two[twoRandVehicle].showInfo();

    }

    public void fillArmies(){
        for (int i = 0; i < teamOneArmy.length; i++) {
            teamOneArmy[i] = addRandomVehicle();
        }
        for (int i = 0; i < teamTwoArmy.length; i++) {
            teamTwoArmy[i] = addRandomVehicle();
        }
    }

    public CombatVehicle addRandomVehicle(){

        CombatVehicle[] possibleVehicles = new CombatVehicle[] {
                new Tank(1 + r.nextInt(maxTankReloadTime), 1 + r.nextInt(maxTankShotAccuracy), 1 + r.nextInt(maxTankArmorThickness)),
                new ArmoredCar(1 + r.nextInt(maxCarWeaponCount), 1 + r.nextInt(maxCarVelocity)),
                new AirDefenceVehicle( 1 + r.nextInt(maxAirDefenceRange), 1 + r.nextInt(maxAirDefenceShootSpeed), 1 + r.nextInt(maxAirDefenceMobility) )
        };
        for (int i = 0; i < possibleVehicles.length; i++) {
            possibleVehicles[i].setAttackAndProtection(1+r.nextInt(maxAttackDamage), r.nextInt(maxProtection));
        }

        return possibleVehicles[r.nextInt(possibleVehicles.length)];
    }

    public boolean isEndOfGame(){
        return isDestroyedArmy(teamOneArmy) || isDestroyedArmy(teamTwoArmy);
    }

    public boolean isDestroyedArmy(CombatVehicle[] army){
        for(int i = 0; i < army.length; i++)
            if(army[i].isDestroyed()) return false;

        return true;
    }

    public void displayWinner(){

    }


}
