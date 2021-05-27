package com.company;

import java.util.LinkedList;
import java.util.List;

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
        takimlar.add(takim1);
        takimlar.add(takim2);
        takimlar.add(takim3);
        takimlar.add(takim4);

    }

    public void grupbirinciveikincisininibul() {
        /*this.grupbirincisi = this.takimlar.get(0);

        for (int i = 1; i<this.takimlar.size(); i++){
            if (this.grupbirincisi.takimpuan < this.takimlar.get(i).takimpuan){
                this.grupbirincisi = this.takimlar.get(i);
            }
        }

        for (int i = 0; i<this.takimlar.size(); i++){
            if (this.grupbirincisi.takimpuan == this.takimlar.get(i).takimpuan){
                this.takimlar.remove(i);
                break;
            }
        }

        this.grupikincisi = this.takimlar.get(0);
        for (int i = 1; i<this.takimlar.size(); i++){
            if (this.grupikincisi.takimpuan < this.takimlar.get(i).takimpuan){
                this.grupikincisi = this.takimlar.get(i);
            }
        }
        */

        this.grupbirincisi = this.takim1;
        this.grupikincisi = this.takim2;

         if (this.grupbirincisi.takimpuan < this.takim2.takimpuan) {
                this.grupikincisi = this.takim1;
                this.grupbirincisi = this.takim2;
         }
         else if (this.grupbirincisi.takimpuan == this.takim2.takimpuan) {
             this.grupikincisi = this.takim2;
         }

         if (this.grupbirincisi.takimpuan < this.takim3.takimpuan) {
                this.grupbirincisi = this.takim3;
         }
         else if (this.grupbirincisi.takimpuan == this.takim3.takimpuan) {
            this.grupikincisi = this.takim3;
         }
         if (this.grupbirincisi.takimpuan < this.takim4.takimpuan) {
                this.grupbirincisi = this.takim4;
         }
         else if (this.grupbirincisi.takimpuan == this.takim4.takimpuan) {
             this.grupikincisi = this.takim4;
         }
         if (this.grupikincisi.takimpuan < this.takim2.takimpuan) {
                this.grupikincisi = this.takim2;
         }
         if (this.grupikincisi.takimpuan < this.takim3.takimpuan) {
                this.grupikincisi = this.takim3;
         }
         if (this.grupikincisi.takimpuan < this.takim4.takimpuan) {
            this.grupikincisi = this.takim4;
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
