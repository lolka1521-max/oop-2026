package oop.labor13.parcialis_minta_2;

public class Eszkoz {
    private String oprendszer;
    private int IP = -1;

    public Eszkoz(String oprendszer){
        this.oprendszer = oprendszer;
    }

    public String getOprendszer(){
        return oprendszer;
    }

    public int getIP(){
        return IP;
    }

    public void setIP(int ip){
        IP = ip;
    }

    public void setOprendszer(String oprendszer){
        this.oprendszer = oprendszer;
    }

    @Override
    public String toString(){
        return oprendszer + " " + IP + "\n";
    }
}
