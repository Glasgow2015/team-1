package com.example.adam.apiary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adam on 07/11/2015.
 */
public class Apiary {

    private String name;
    private String location;
    private int year;
    private List<Character> months;
    private List<Boolean> answers;
    private List<Hive> hives;
    private Map<String, Character> monthlookup;

    private Apiary(String name, String location, int year){
        this.name = name;
        this.location = location;
        this.year = year;
        months = new ArrayList<Character>();
        answers = new ArrayList<Boolean>();
        hives = new ArrayList<Hive>();
        monthlookup = new HashMap<String,Character>();
        monthlookup.put("January", 'A');
        monthlookup.put("February", 'B');
        monthlookup.put("March", 'C');
        monthlookup.put("April", 'D');
        monthlookup.put("May", 'E');
        monthlookup.put("June", 'F');
        monthlookup.put("July", 'G');
        monthlookup.put("August", 'H');
        monthlookup.put("September", 'I');
        monthlookup.put("October", 'J');
        monthlookup.put("November", 'K');
        monthlookup.put("December", 'L');
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public int getYear(){
        return year;
    }

    public List<Character> getMonths(){
         return new ArrayList<Character>(months);
    }

    /**
     * Adds the specified month to the harvest months list
     * @param month the month to be set (Capital required)
     */
    public void setHarvestMonth(String month){
        if(monthlookup.get(month)!=null){
            months.add(monthlookup.get(month));
        }

    }

}
