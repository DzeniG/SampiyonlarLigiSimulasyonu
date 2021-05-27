package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Grup {

    String grupismi;
    Takim takim1;
    Takim takim2;
    Takim takim3;
    Takim takim4;
    Takim grupbirincisi;
    Takim grupikincisi;
    List<Takim> takimlar = new LinkedList<>();



    public Grup(String grupismi) {
        this.grupismi = grupismi;
        takim1 = new Takim();
        takim2 = new Takim();
        takim3 = new Takim();
        takim4 = new Takim();
    }

    public Grup(String grupismi, Takim takim1, Takim takim2, Takim takim3, Takim takim4) {
        this.grupismi = grupismi;
        this.takim1 = takim1;
        this.takim2 = takim2;
        this.takim3 = takim3;
        this.takim4 = takim4;

    }


    public void grupbirinciveikincisininibul() {


        this.takimlar.add(takim1);
        this.takimlar.add(takim2);
        this.takimlar.add(takim3);
        this.takimlar.add(takim4);

        this.grupbirincisi = takimlar.get(0);

        for (Takim t : takimlar){
            if (this.grupbirincisi.takimpuan < t.takimpuan){
                this.grupbirincisi = t;
            }
        }

        for (Takim t : takimlar){
            if (this.grupbirincisi.takimpuan == t.takimpuan){
                this.takimlar.remove(t);
                break;
            }
        }

        this.grupikincisi = takimlar.get(0);
        for (Takim t : takimlar){
            if (this.grupikincisi.takimpuan < t.takimpuan){
                this.grupikincisi = t;
            }
        }

        if (this.grupbirincisi.takimpuan == this.grupikincisi.takimpuan){
            this.grupbirincisi.averaj = this.grupbirincisi.takimaclaritotalgol / this.grupbirincisi.takimtotalgol;
            this.grupikincisi.averaj = this.grupikincisi.takimaclaritotalgol / this.grupikincisi.takimtotalgol;

            if (this.grupbirincisi.averaj < this.grupikincisi.averaj){
                Takim temp = this.grupbirincisi;
                this.grupbirincisi = this.grupikincisi;
                this.grupikincisi = temp;
            }
            else if (this.grupbirincisi.averaj == this.grupikincisi.averaj){
                if (this.grupbirincisi.takimtotalgol < this.grupikincisi.takimtotalgol){
                    Takim temp = this.grupbirincisi;
                    this.grupbirincisi = this.grupikincisi;
                    this.grupikincisi = temp;
                }
            }
        }


    }
    public String toString() {

        return "Grup " + grupismi + ":\n" + takim1.toString() + "\n" + takim2.toString() + "\n" + takim3.toString() + "\n" + takim4.toString();
    }
}
