package oop.labor06.felveteli.informatika;

import oop.labor06.felveteli.diak.Diak;

import java.util.ArrayList;

public class Informatika {

    private ArrayList<Diak> diakok;

    public Informatika(){
        this.diakok = new ArrayList<>();
    }

    public void ujBeiratkozo(Diak diak){
        this.diakok.add(diak);
    }

    public int felvetelizokSzama(){
        return this.diakok.size();
    }

    public double felvetelizokAtlaga(){
        if(diakok.isEmpty()){
            return 0;
        }
        double atlag = 0;
        for (int i = 0; i < diakok.size(); i++) {
            atlag = atlag + diakok.get(i).atlag();
        }
        return atlag/diakok.size();
    }

    public void listazOsszes(){
        for(Diak d: diakok){
            System.out.println(d);
        }
    }

    public void nagyobbAtlag(double atlag){
        if(diakok.isEmpty()){
            System.out.println("A tomb ures szoval nincs ennel az " + atlag + "-nal nagyobb");
        }
        for (int i = 0; i< diakok.size(); i++)
            if(diakok.get(i).atlag() >= atlag) {
                System.out.println(diakok.get(i).toString());
            }
    }
}
