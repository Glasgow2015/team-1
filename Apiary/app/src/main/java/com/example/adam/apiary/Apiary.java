package com.example.adam.apiary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adam on 07/11/2015.
 */
public class Apiary implements Serializable{

    private String name;
    private String location;
    private int year;
    private List<Character> months;
    private boolean answers[];
    private List<Hive> hives;
    private Map<String, Character> monthlookup;

    private Apiary(String name, String location, int year, List<Character> months, boolean answers[]){
        this.name = name;
        this.location = location;
        this.year = year;
        this.months = months;
        this.answers = answers;
        hives = new ArrayList<Hive>();
        monthlookup = new HashMap<String,Character>();
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

    public boolean[] getAnswers(){
        return answers;
    }

    public List<Character> getMonths() {
        return new ArrayList<Character>(months);
    }

    public void addHive(Hive hive) {
        hives.add(hive);
    }

    public List<Hive> getHives(){
        return new ArrayList<Hive>(hives);
    }
}
