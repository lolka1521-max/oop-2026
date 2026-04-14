package oop.labor07;

public class Motorbicikli extends Jarmu{
    private String tipus;

    public Motorbicikli(String rendszam, String marka, String tipus){
        super(rendszam,marka);
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return super.toString() + " Motorbicikli{" +
                "tipus='" + tipus + '\'' +
                '}' + '\n';
    }
}
