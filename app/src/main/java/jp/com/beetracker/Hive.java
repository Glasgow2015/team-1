
package jp.com.beetracker;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 07/11/2015.
 */
public class Hive{

    private String apname;
    private String table;
    private int number;
    private Double log;
    private Double lat;
    private Long date;
    private HiveType hivetype;
    private SunExposure sun;
    private List<Inspection> inspections;
    private List<Harvest> harvests;

    public String getApiaryName() {
        return apname;
    }

    public void setApiaryName(String apiaryName) {
        this.apname = apiaryName;
    }

    public Hive(Long date, Double lat, Double log, int hiveNo, String apiaryName) {
        this.date = date;
        this.lat = lat;
        this.log = log;
        this.number = hiveNo;
        this.apname = apiaryName;
    }

    public String getApname() {
        return apname;
    }

    public void setApname(String apname) {
        this.apname = apname;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHiveNo() {
        return number;
    }

    public void setHiveNo(int hiveNo) {
        this.number = hiveNo;
    }

    public Double getLog() {
        return log;
    }

    public void setLog(Double log) {
        this.log = log;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public HiveType getHivetype() {
        return hivetype;
    }

    public void setHivetype(HiveType hivetype) {
        this.hivetype = hivetype;
    }

    public SunExposure getSun() {
        return sun;
    }

    public void setSun(SunExposure sun) {
        this.sun = sun;
    }

    public void setInspections(List<Inspection> inspections) {
        this.inspections = inspections;
    }

    public void setHarvests(List<Harvest> harvests) {
        this.harvests = harvests;
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
