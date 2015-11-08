
package jp.com.beetracker;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 07/11/2015.
 */
public class Hive{

    private String apiaryName;
    private int hiveNo;
    private Double lng;
    private Double lat;
    private Date date;
    private HiveType hivetype;
    private SunExposure sun;
    private List<Inspection> inspections;
    private List<Harvest> harvests;

    public String getApiaryName() {
        return apiaryName;
    }

    public void setApiaryName(String apiaryName) {
        this.apiaryName = apiaryName;
    }

    public Hive(SunExposure sun, HiveType hivetype, Date date, Double lat, Double lng, int hiveNo, String apiaryName) {
        this.sun = sun;
        this.hivetype = hivetype;
        this.date = date;
        this.lat = lat;
        this.lng = lng;
        this.hiveNo = hiveNo;
        this.apiaryName = apiaryName;
    }

    public int getHiveNo() {
        return hiveNo;
    }

    public void setHiveNo(int hiveNo) {
        this.hiveNo = hiveNo;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
