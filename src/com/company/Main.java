package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    static List<Takim> torba1 = new LinkedList<>();
    static List<Takim> torba2 = new LinkedList<>();
    static List<Takim> torba3 = new LinkedList<>();
    static List<Takim> torba4 = new LinkedList<>();
    static List<Takim> takimlar = new LinkedList<>();
    static Map<String, Grup> gruplar = new HashMap<>();
    static List<Mac> maclar = new LinkedList<>();
    static List<Takim> ustegidenler = new LinkedList<>();

    public static void Takimvetorbalisteleriyap () {
        Takim takim1 = new Takim("Bayern Munich", "Almanya", 1);
        Takim takim2 = new Takim("Sevilla", "İspanya", 1);
        Takim takim3 = new Takim("Real Madrid", "İspanya", 1);
        Takim takim4 = new Takim("Liverpool", "İngiltere", 1);
        Takim takim5 = new Takim("Juventus", "İtalya", 1);
        Takim takim6 = new Takim("Paris Saint-Germain", "Fransa", 1);
        Takim takim7 = new Takim("Zenit", "Rusya", 1);
        Takim takim8 = new Takim("Porto", "Portekiz", 1);

        Takim takim9 = new Takim("Barcelona", "İspanya", 2);
        Takim takim10 = new Takim("Atletico Madrid", "İspanya", 2);
        Takim takim11 = new Takim("Manchester City", "İngiltere", 2);
        Takim takim12 = new Takim("Manchester United", "İngiltere", 2);
        Takim takim13 = new Takim("Borussia Dortmund", "Almanya", 2);
        Takim takim14 = new Takim("Shakhtar Donetsk", "Ukrayna",2);
        Takim takim15 = new Takim("Chelsea", "İngiltere", 2);
        Takim takim16 = new Takim("Ajax", "Hollanda", 2);

        Takim takim17 = new Takim("Dynamo Kiev", "Ukrayna", 3);
        Takim takim18 = new Takim("Red Bull Salzburg", "Almanya", 3);
        Takim takim19 = new Takim("RB Leipzig", "Almanya", 3);
        Takim takim20 = new Takim("Internazionale", "İtalya", 3);
        Takim takim21 = new Takim("Olympiacos", "Yunanistan", 3);
        Takim takim22 = new Takim("Lazio", "İtalya", 3);
        Takim takim23 = new Takim("Krasnodar", "Rusya", 3);
        Takim takim24 = new Takim("Atalanta", "İtalya", 3);

        Takim takim25 = new Takim("Lokomotiv Moskova", "Rusya", 4);
        Takim takim26 = new Takim("Marseille", "Fransa", 4);
        Takim takim27 = new Takim("Club Brugge", "Belçika", 4);
        Takim takim28 = new Takim("Bor. Mönchengladbach", "Almanya", 4);
        Takim takim29 = new Takim("Galatasaray", "Türkiye", 4);
        Takim takim30 = new Takim("Midtjylland", "Danimarka", 4);
        Takim takim31 = new Takim("Rennes", "Fransa", 4);
        Takim takim32 = new Takim("Ferencvaros", "Macaristan", 4);

        takimlar.add(takim1);
        takimlar.add(takim2);
        takimlar.add(takim3);
        takimlar.add(takim4);
        takimlar.add(takim5);
        takimlar.add(takim6);
        takimlar.add(takim7);
        takimlar.add(takim8);
        takimlar.add(takim9);
        takimlar.add(takim10);
        takimlar.add(takim11);
        takimlar.add(takim12);
        takimlar.add(takim13);
        takimlar.add(takim14);
        takimlar.add(takim15);
        takimlar.add(takim16);
        takimlar.add(takim17);
        takimlar.add(takim18);
        takimlar.add(takim19);
        takimlar.add(takim20);
        takimlar.add(takim21);
        takimlar.add(takim22);
        takimlar.add(takim23);
        takimlar.add(takim24);
        takimlar.add(takim25);
        takimlar.add(takim26);
        takimlar.add(takim27);
        takimlar.add(takim28);
        takimlar.add(takim29);
        takimlar.add(takim30);
        takimlar.add(takim31);
        takimlar.add(takim32);

        for (Takim t : takimlar) {
            // teams.put(t.isim, t);
            if (t.torba == 1) {
                torba1.add(t);
            } else if (t.torba == 2) {
                torba2.add(t);
            } else if (t.torba == 3) {
                torba3.add(t);
            } else {
                torba4.add(t);
            }
        }
    }



        public static void guruplariolustur (int num) {
            for(int i = 0; i < num; i++) {
                Grup g = new Grup(String.valueOf((char)('A' + i)));
                gruplar.put(g.grupismi, g);
            }
        }

    public static void torba1cekilis () {
        List<String> grup = new LinkedList<>();
        for(int i = 0; i < 8; i++) {
            grup.add(String.valueOf((char)('A' + i)));
        }
        for(int i = 0; i < 8; i++) {
            int size = torba1.size();
            int index = (int)(Math.random() * size);
            int groupNo = (int)(Math.random() * size);
            String No = grup.get(groupNo);
            Takim t = torba1.get(index);
            torba1.remove(index);
            grup.remove(groupNo);
            gruplar.get(No).takim1 = t;
        }
    }

    public static void torba2cekilis() {
        List<String> group = new LinkedList<>();
        for(int i = 0; i < 8; i++) {
            group.add(String.valueOf((char)('A' + i)));
        }
        for(int i = 0; i < 8; i++) {
            int size = torba2.size();
            int index = (int)(Math.random() * size);
            Takim t = torba2.get(index);
            List<String> available = new LinkedList<>();
            for(int j = 0; j < 8; j++) {
                Grup g = gruplar.get(String.valueOf((char)('A' + j)));
                if(g.takim2.toString().equals("NA") && !g.takim1.ulke.equals(t.ulke)) {
                    available.add(String.valueOf((char)('A' + j)));
                }
            }
            int groupNo = (int)(Math.random() * available.size());
            String No = available.get(groupNo);
            torba2.remove(index);
            gruplar.get(No).takim2 = t;
        }
    }

    public static void torba3cekilis() {
        List<String> grup = new LinkedList<>();
        for(int i = 0; i < 8; i++) {
            grup.add(String.valueOf((char)('A' + i)));
        }
        for(int i = 0; i < 8; i++) {
            int size = torba3.size();
            int index = (int)(Math.random() * size);
            Takim t = torba3.get(index);
            List<String> available = new LinkedList<>();
            for(int j = 0; j < 8; j++) {
                Grup g = gruplar.get(String.valueOf((char)('A' + j)));
                if(g.takim3.toString().equals("NA") && !g.takim1.ulke.equals(t.ulke) && !g.takim2.ulke.equals(t.ulke)) {
                    available.add(String.valueOf((char)('A' + j)));
                }
            }
            int groupNo = (int)(Math.random() * available.size());
            String No = available.get(groupNo);
            torba3.remove(index);
            gruplar.get(No).takim3 = t;
        }
    }

    public static void torba4cekilis() {
        List<String> grup = new LinkedList<>();
        for(int i = 0; i < 8; i++) {
            grup.add(String.valueOf((char)('A' + i)));
        }
        for(int i = 0; i < 8; i++) {
            int size = torba4.size();
            int index = (int)(Math.random() * size);
            Takim t = torba4.get(index);
            List<String> available = new LinkedList<>();
            for(int j = 0; j < 8; j++) {
                Grup g = gruplar.get(String.valueOf((char)('A' + j)));
                if(g.takim4.toString().equals("NA") && !g.takim1.ulke.equals(t.ulke) && !g.takim2.ulke.equals(t.ulke) && !g.takim3.ulke.equals(t.ulke)) {
                    available.add(String.valueOf((char)('A' + j)));
                }
            }
            int groupNo = (int)(Math.random() * available.size());
            String No = available.get(groupNo);
            torba4.remove(index);
            gruplar.get(No).takim4 = t;
        }
    }

    public static void cekilisler() {
        torba1cekilis();
        torba2cekilis();
        torba3cekilis();
        torba4cekilis();
    }


    public static void printbutungruplar() {
        for(int i = 0; i < 8; i++) {
            Grup g = gruplar.get(String.valueOf((char)('A' + i)));
            System.out.println("Group " + g.grupismi);
            System.out.println(g.takim1.toString());
            System.out.println(g.takim2.toString());
            System.out.println(g.takim3.toString());
            System.out.println(g.takim4.toString());

        }
    }

    public static void macfiksturuolustur() {
        for(int i = 0; i < 8; i++) {
            Grup g = gruplar.get(String.valueOf((char)('A' + i)));
                Mac m1 = new Mac(g.takim1, g.takim2);
                maclar.add(m1);
                Mac m2 = new Mac(g.takim1, g.takim3);
                maclar.add(m2);
                Mac m3 = new Mac(g.takim1, g.takim4);
                maclar.add(m3);
                Mac m4 = new Mac(g.takim2, g.takim3);
                maclar.add(m4);
                Mac m5 = new Mac(g.takim2, g.takim4);
                maclar.add(m5);
                Mac m6 = new Mac(g.takim3, g.takim4);
                maclar.add(m6);
        }
    }

    public static void maclarıoynat() {
        for (int i = 0; i < maclar.size(); i++) {
            Mac m = maclar.get(i);
            m.macoyna();
        }
    }

    public static void gruplarınbirinciveikincileri() {
        for(int i = 0; i < 8; i++) {
            Grup g = gruplar.get(String.valueOf((char)('A' + i)));
            g.grupbirinciveikincisininibul();
            ustegidenler.add(g.grupbirincisi);
            ustegidenler.add(g.grupbirincisi);
        }
    }

    public static void printustegecentakimlar() {
        System.out.println("Üste geçen takımlar:");
        for(int i = 0; i < 8; i++) {
            Grup g = gruplar.get(String.valueOf((char)('A' + i)));
            System.out.println("Group " + g.grupismi);
            System.out.println(g.grupbirincisi);
            System.out.println(g.grupikincisi);
        }
    }


    public static void main(String[] args) throws Exception {
        // write your code here

        int numtry = 1;
        while(numtry != 0) {
            try {
                Takimvetorbalisteleriyap();
                guruplariolustur(8);
                cekilisler();
                macfiksturuolustur();
                maclarıoynat();
                gruplarınbirinciveikincileri();
                break;
            } catch (Exception e) {
                continue;
            }
        }
          //printbutungruplar();
          printustegecentakimlar();


    }


}
