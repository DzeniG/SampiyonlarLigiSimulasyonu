package com.company;

import java.io.Serializable;


public class Takim implements Serializable{
    String isim;
    String ulke;
    int torba;
    int takimpuan;
    int takimtotalgol;
    int takimaclaritotalgol;
    float averaj;

    public Takim() {
        isim = "NA";
        ulke = "NA";
        torba = -1;
    }
    public Takim(String isim, String ulke, int torba) {
        this.isim = isim;
        this.ulke = ulke;
        this.torba = torba;
        this.takimpuan = 0;
        this.takimtotalgol = 0;
        this.takimaclaritotalgol = 0;
        this.averaj = 0.0f;

    }
    public String toString() {

        return this.isim;
    }
}