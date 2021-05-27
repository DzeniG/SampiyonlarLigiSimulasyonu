package com.company;
import java.util.Random;

public class Mac {

    Takim takim1;
    Takim takim2;
    int takim1golsayisi;
    int takim2golsayisi;
    int mactotalgol;


    public Mac(Takim takim1, Takim takim2) {
        this.takim1 = takim1;
        this.takim2 = takim2;

    }

    public void macoyna (){
        Random random = new Random();
        takim1golsayisi = random.nextInt(9);
        takim2golsayisi = random.nextInt(9);
        mactotalgol = takim1golsayisi + takim2golsayisi;
        takim1.takimtotalgol = takim1.takimtotalgol + takim1golsayisi;
        takim2.takimtotalgol = takim2.takimtotalgol + takim2golsayisi;
        takim1.takimaclaritotalgol = takim1.takimaclaritotalgol + mactotalgol;
        takim2.takimaclaritotalgol = takim2.takimaclaritotalgol + mactotalgol;

        if (takim1golsayisi > takim2golsayisi){
            takim1.takimpuan = takim1.takimpuan + 3;

        }

        else if (takim1golsayisi < takim2golsayisi){
            takim2.takimpuan = takim2.takimpuan + 3;

        }

        else {
            takim1.takimpuan = takim1.takimpuan + 1;
            takim2.takimpuan = takim2.takimpuan + 1;

        }
    }
}
