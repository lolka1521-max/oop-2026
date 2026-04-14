package oop.labor07;

public class Jarmu {
    private String rendszam;
    private String marka;
    private boolean kolcsonzott = false;

    public Jarmu(String rendszam,String marka){
        this.marka = marka;
        this.rendszam = rendszam;
    }

    public String getRendszam(){
        return rendszam;
    }

    public String getMarka(){
        return marka;
    }

    public boolean getKolcsonzott(){
        return kolcsonzott;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "rendszam='" + rendszam + '\'' +
                ", marka='" + marka + '\'' +
                ", kolcsonzott = " + kolcsonzott +  '\'' +
                '}';
    }
}
