package Bai12;

import java.time.Year;

//Nguyễn Khắc Tài - CT030147

public class Nguoi {
    protected String name;
    protected Year yob;
    protected String hometown;

    public Nguoi(String name, Year yob, String hometown) {
        this.name = name;
        this.yob = yob;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYob() {
        return yob;
    }

    public void setYob(Year yob) {
        this.yob = yob;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}