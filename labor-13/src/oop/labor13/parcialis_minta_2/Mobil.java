package oop.labor13.parcialis_minta_2;

public class Mobil extends Eszkoz{
    private boolean SIM;

    public Mobil(String oprendszer, boolean bool){
        this.SIM = bool;
        super(oprendszer);
    }

    public boolean isSIM(){
        if(SIM == true){
            return true;
        }
        return false;
    }

    public void setSIM(boolean bool){
        SIM = bool;
    }

    @Override
    public String toString(){
        return super.toString() + " " + SIM + "\n";
    }
}
