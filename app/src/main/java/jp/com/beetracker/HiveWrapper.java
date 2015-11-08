package jp.com.beetracker;

/**
 * Created by ross on 08/11/2015.
 */
public class HiveWrapper {
    private Hive hive;
    private String avName;

    public HiveWrapper(Hive hive, String avName) {
        this.hive = hive;
        this.avName = avName;
    }

    public Hive getHive() {
        return hive;
    }

    public void setHive(Hive hive) {
        this.hive = hive;
    }

    public String getAvName() {
        return avName;
    }

    public void setAvName(String avName) {
        this.avName = avName;
    }
}
