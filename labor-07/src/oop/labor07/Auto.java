package oop.labor07;

public class Auto extends Jarmu {
    private int utasszam;

    public Auto(String rendszam, String marka, int utasszam){
        this.utasszam = utasszam;
        super(rendszam,marka);
    }

    @Override
    public String toString() {
        return super.toString()
                + " Auto{" +
                " utasszam=" + utasszam +
                '}' + '\n';
    }
}
