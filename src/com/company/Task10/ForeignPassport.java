package com.company.Task10;

import java.util.ArrayList;

public class ForeignPassport extends Passport {
    private ArrayList<String> visas = new ArrayList<String>();

    ForeignPassport(ArrayList<String> visas) {
        this.visas = visas;
    }

    public void addNewVisa(String visa){
        visas.add(visa);
    }

}
