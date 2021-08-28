package com.company.Task11.DiagramClasses;

import java.util.ArrayList;

public class Comp {

    private int countDisk;
    private int countPrintDevice;
    private ArrayList<Disk> disks = new ArrayList<Disk>();
    private IPrintInformation[] PrintDevice;

    public void addDevice(int index, IPrintInformation si){

    }

    public void addDisk(int index, Disk d){
        disks.add(d);
    }

    public boolean CheckDisk(String device){
        return true;
    }

    Comp(int d, int pd){

    }

    public void insertReject(String device, boolean b){

    }

    public boolean printInfo(String text, String device){
        return true;
    }

    public String readInfo(String device){
        return "";
    }

    public void showDisk(){

    }

    public void showPrintDevice(){

    }

    public void writeInfo(String text, String showDevice){

    }


}
