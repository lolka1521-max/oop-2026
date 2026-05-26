package oop.labor13.parcialis_minta_2;

public class Szamitogep extends Eszkoz{
    private double HDmeret;

    public Szamitogep(String oprendszer, double HDmeret){
        super(oprendszer);
        this.HDmeret = HDmeret;
    }

    public double getHDmeret(){
        return HDmeret;
    }

    public void setHDmeret(double hDmeret){
        HDmeret = hDmeret;
    }

    @Override
    public String toString(){
        return super.toString() + " " + HDmeret + "\n";
    }
}
