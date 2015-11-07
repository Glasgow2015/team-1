package jp.com.beetracker;

import java.io.Serializable;

/**
 * Created by ross on 07/11/2015.
 */
public class Adam implements Serializable {
    private int number;
    private String name;

//    public Adam(){
//        this.number = 2;
//        this.name = "adam";
//    }

    public Adam(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}