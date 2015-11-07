package jp.com.beetracker;

/**
 * Created by ross on 07/11/2015.
 */
public class Corrd {

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    private String log;
    private String lat;

    public Corrd(String log, String lat) {
        this.log = log;
        this.lat = lat;
    }

}
