package jp.com.beetracker;

/**
 * Created by ross on 08/11/2015.
 */
public class HiveWrapper {

    private String table;
    private Hive hive;

    public HiveWrapper(String avName, Hive hive ) {
        this.table = avName;
        this.hive = hive;
    }

    public Hive getHive() {
        return hive;
    }

    public void setHive(Hive hive) {
        this.hive = hive;
    }

    public String getAvName() {
        return table;
    }

    public void setAvName(String avName) {
        this.table = avName;
    }
}
