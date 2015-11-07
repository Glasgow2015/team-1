package jp.com.beetracker;

/**
 * Created by ross on 07/11/2015.
 */
public class DomainObject {
    private String name;
    private Corrd location;

    public DomainObject(String name, Corrd location) {
        this.name = name;
        this.location = location;
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

    public String getValue(){
        return name;
    }
}
