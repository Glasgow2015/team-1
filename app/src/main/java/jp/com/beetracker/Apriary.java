package jp.com.beetracker;

import java.io.Serializable;

/**
 * Created by ross on 07/11/2015.
 */
public class Apriary implements Serializable {

    private String name;
    private Corrd location;
    private String year;

    public Apriary(String name, Corrd location, String year) {
        this.name = name;
        this.location = location;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Corrd getLocation() {
        return location;
    }

    public void setLocation(Corrd location) {
        this.location = location;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}