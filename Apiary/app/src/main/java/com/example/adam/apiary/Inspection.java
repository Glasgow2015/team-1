package com.example.adam.apiary;

import java.io.Serializable;

/**
 * Created by Adam on 07/11/2015.
 */
public class Inspection implements Serializable {

    private int number;
    private int dateday;
    private int datemonth;
    private int dateyear;
    private Weather weather;
    private HiveState state;
    private Strength strength;
    private Temper temper;
    private boolean queen;
    private CombCondition honeyCondition;
    private CombCondition pollenCondition;
    private Pests hiveBeetles;
    private Pests mites;
    private boolean safariAnts;
    private boolean chalkBrood;
    private GenCondition hiveCondition;
    private GenCondition toolsCondition;

    

    public Inspection(){

    }

}
