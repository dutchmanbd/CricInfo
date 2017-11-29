package com.zxdmjr.cricinfo.models;

/**
 * Created by eict on 11/29/17.
 */

public class Title {

    private String name;
    private int logo;

    public Title(String name, int logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
