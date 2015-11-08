package com.example.adam.apiary;

/**
 * Created by Adam on 07/11/2015.
 */
public class Harvest {

    private int hiveNo;
    private int dateday;
    private int datemonth;
    private int dateyear;
    private int quantityOfCombs;
    private boolean protectiveClothingForBeekeeper;
    private boolean protectiveClothingForAllAssistants;
    private boolean smokerAvailable;
    private int noOfBuckets;

    public Harvest(int hiveNo, int dateday, int datemonth, int dateyear, int quantityOfCombs,
                   boolean protectiveClothingForBeekeeper, boolean protectiveClothingForAllAssistants,
                   boolean smokerAvailable, int noOfBuckets) {
        this.hiveNo = hiveNo;
        this.dateday = dateday;
        this.datemonth = datemonth;
        this.dateyear = dateyear;
        this.quantityOfCombs = quantityOfCombs;
        this.protectiveClothingForBeekeeper = protectiveClothingForBeekeeper;
        this.protectiveClothingForAllAssistants = protectiveClothingForAllAssistants;
        this.smokerAvailable = smokerAvailable;
        this.noOfBuckets = noOfBuckets;
    }

    public int getHiveNo() {
        return hiveNo;
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

    public int getQuantityOfCombsHarvested() {
        return quantityOfCombs;
    }

    public boolean isProtectiveClothingForBeekeeperAvailable() {
        return protectiveClothingForBeekeeper;
    }

    public boolean isProtectiveClothingForAllAssistantsAvailable() {
        return protectiveClothingForAllAssistants;
    }

    public boolean isSmokerAvailable() {
        return smokerAvailable;
    }

    public int getNoOfBuckets() {
        return noOfBuckets;
    }
}
