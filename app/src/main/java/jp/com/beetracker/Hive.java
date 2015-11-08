package com.example.adam.apiary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 07/11/2015.
 */
public class Hive{

    private String apiaryName;
    private int hiveNo;
    private String location;
    private int dateday;
    private int datemonth;
    private int dateyear;
    private HiveType hivetype;
    private SunExposure sun;
    private List<Inspection> inspections;
    private List<Harvest> harvests;

    public Hive(String apiaryNo, int hiveNo, String location, int dateday, int datemonth, int dateyear, HiveType hiveType, SunExposure sun){
        this.apiaryName = apiaryName;
        this.hiveNo = hiveNo;
        this.location = location;
        this.dateday = dateday;
        this.datemonth = datemonth;
        this.dateyear = dateyear;
        this.hivetype = hiveType;
        this.sun = sun;
        inspections = new ArrayList<Inspection>();
        harvests = new ArrayList<Harvest>();
    }

    public String getApiaryName(){
        return apiaryName;
    }
    public int getHiveNo(){
        return hiveNo;
    }

    public String getLocation(){
        return location;
    }

    public int getDateday(){
        return dateday;
    }

    public int getDatemonth(){
        return datemonth;
    }

    public int getDateyear(){
        return dateyear;
    }

    public HiveType getHivetype(){
        return hivetype;
    }

    public SunExposure getSunExposure(){
        return sun;
    }

    public void addInspection(Inspection i){
        inspections.add(i);
    }

    public void addHarvest(Harvest h){
        harvests.add(h);
    }

    public List<Inspection> getInspections(){
        return new ArrayList<Inspection>(inspections);
    }

    public List<Harvest> getHarvests(){
        return new ArrayList<Harvest>(harvests);
    }

    public Inspection getLastInspection(){
        return inspections.get(inspections.size()-1);
    }

    public Harvest getLastHarvest(){
        return harvests.get(harvests.size()-1);
    }

}
