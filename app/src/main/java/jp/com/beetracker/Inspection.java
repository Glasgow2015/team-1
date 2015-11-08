package com.example.adam.apiary;

/**
 * Created by Adam on 07/11/2015.
 */
public class Inspection {

    private int hiveNo;
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
    private int noOfBees;

    public Inspection(int hiveNo, int number, int dateday, int datemonth, int dateyear, Weather weather,
                      HiveState state, Strength strength, Temper temper, boolean queen,
                      CombCondition honeyCondition, CombCondition pollenCondition, Pests hiveBeetles,
                      Pests mites, boolean safariAnts, boolean chalkBrood, GenCondition hiveCondition,
                      GenCondition toolsCondition, int noOfBees){
        this.hiveNo = hiveNo;
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
        this.noOfBees = noOfBees;
    }

    public int getHiveNo() {
        return hiveNo;
    }

    public int getInspectionNumber() {
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

    public HiveState getHiveState() {
        return state;
    }

    public Strength getHiveStrength() {
        return strength;
    }

    public Temper getHiveTemper() {
        return temper;
    }

    public boolean queenCellsInBroodCombs() {
        return queen;
    }

    public CombCondition getHoneyStoresCondition() {
        return honeyCondition;
    }

    public CombCondition getPollenStoresCondition() {
        return pollenCondition;
    }

    public Pests getHiveBeetleLevel() {
        return hiveBeetles;
    }

    public Pests getMiteLevel() {
        return mites;
    }

    public boolean safariAnts() {
        return safariAnts;
    }

    public boolean chalkBrood() {
        return chalkBrood;
    }

    public GenCondition getHiveCondition() {
        return hiveCondition;
    }

    public GenCondition getClothingAndToolsCondition() {
        return toolsCondition;
    }
}
