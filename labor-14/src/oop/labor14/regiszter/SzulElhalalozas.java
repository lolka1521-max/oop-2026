package oop.labor14.regiszter;

public class SzulElhalalozas {
    String nev;
    int szulEv;
    int halEv;

    public SzulElhalalozas(String nev, int szulEv, int halEv){
        this.nev = nev;
        this.szulEv = szulEv;
        this.halEv = halEv;
    }

    public void setHalEv(int halEv){
        this.halEv = halEv;
    }

    public int getSzulEv(){
        return szulEv;
    }

    public int gethalEv(){
        return halEv;
    }

    public String getNev(){
        return nev;
    }

    @Override
    public String toString() {
        return nev + " " +
                szulEv + " " +
                halEv;
    }
}
