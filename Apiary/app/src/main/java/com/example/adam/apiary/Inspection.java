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

    public Inspection(int number, int dateday, int datemonth, int dateyear, Weather weather,
                      HiveState state, Strength strength, Temper temper, boolean queen,
                      CombCondition honeyCondition, CombCondition pollenCondition, Pests hiveBeetles,
                      Pests mites, boolean safariAnts, boolean chalkBrood, GenCondition hiveCondition,
                      GenCondition toolsCondition){
        this.number = number;
        this.dateday=dateday;
        this.datemonth=datemonth;
        this.dateyear=dateyear;
        this.weather=weather;
        this.state=state;
        this.strength=strength;
        this.temper=temper;
        this.queen=queen;
        this.honeyCondition=honeyCondition;
        this.pollenCondition=pollenCondition;
        this.hiveBeetles=hiveBeetles;
        this.mites=mites;
        this.safariAnts=safariAnts;
        this.chalkBrood=chalkBrood;
        this.hiveCondition=hiveCondition;
        this.toolsCondition=toolsCondition;
    }

    public int getNumber() {
        return number;
    }

    public int getDateday() {
        return dateday;
    }

    public int getDatemonth() {
        return datemonth;
    }

    public int getDateyear() {
        return dateyear;
    }

    public Weather getWeather() {
        return weather;
    }

    public HiveState getState() {
        return state;
    }

    public Strength getStrength() {
        return strength;
    }

    public Temper getTemper() {
        return temper;
    }

    public boolean isQueen() {
        return queen;
    }

    public CombCondition getHoneyCondition() {
        return honeyCondition;
    }

    public CombCondition getPollenCondition() {
        return pollenCondition;
    }

    public Pests getHiveBeetles() {
        return hiveBeetles;
    }

    public Pests getMites() {
        return mites;
    }

    public boolean isSafariAnts() {
        return safariAnts;
    }

    public boolean isChalkBrood() {
        return chalkBrood;
    }

    public GenCondition getHiveCondition() {
        return hiveCondition;
    }

    public GenCondition getToolsCondition() {
        return toolsCondition;
    }
}
