package com.company.Task11.DiagramClasses;

public class Disk {

    private String memory = "";
    private int memSize;

    private String name;

    Disk(){

    }

    Disk(String memory, int memSize){
        this.memory = memory;
        this.memSize = memSize;
    }

    public String getName(){
        return name;
    }

    public String read(){
        return memory;
    }

    public void write(String text){
        memory += text;
    }

}
