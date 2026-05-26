package oop.labor13.parcialis_minta_2;

import oop.labor13.parcialis_minta_3.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Halozat {
    Map<Integer, Eszkoz> eszkozok = new HashMap<>();

    public Halozat(String path){
        int i = 0;
       try{
           Scanner scanner = new Scanner(new File(path));
           while (scanner.hasNextLine()){
               String line = scanner.nextLine();
               if(line != null){
                   if(i > 255) {
                       break;
                   }
                   String[] items = line.split(" ");
                   int ip = Integer.parseInt(items[0].trim());
                   String oprendszer = items[1].trim();
                   String adat = items[2].trim();
                   if( adat == "true" || adat == "false"){
                       eszkozok.put(ip,new Mobil(oprendszer, Boolean.parseBoolean(adat)));
                   }
                  else {
                       eszkozok.put(ip,new Szamitogep(oprendszer,Double.parseDouble(adat)));
                  }
                  i++;
               }
           }
       }catch (FileNotFoundException e){
           System.out.println(e.getMessage());
       }
    }

    public boolean isTelevan(){
        if (eszkozok.size() == 254){
            return true;
        }
        return false;
    }

    public int elsoSzabad(){
        for (int i = 0; i < eszkozok.size(); i++) {
            if(!eszkozok.containsKey(i)){
                return i;
            }
        }
        return -1;
    }

    public void kapcsolodas(Eszkoz eszkoz){
        int szabad = elsoSzabad();
        if (szabad != -1){
            eszkoz.setIP(szabad);
            eszkozok.put(szabad, eszkoz);
        }
        else {
            System.out.println("A tarolo tele van es nem lehet tenni bele semmit");
        }
    }

    public void levalas(Eszkoz eszkoz){
        for (int i = 0; i < eszkozok.size(); i++){
            if(eszkozok.get(i).getIP() == eszkoz.getIP()){
                eszkozok.get(i).setIP(-1);
                eszkozok.remove(i);
            }
        }
    }

    public void listazas(){
        for (int i = 0; i < eszkozok.size(); i++){
            if(eszkozok.get(i).getIP() != -1){
                System.out.println(eszkozok.get(i));
            }
        }
    }

    public void listazMobil(){
        for (int i = 0; i < eszkozok.size(); i++){
            if (eszkozok.get(i) instanceof Mobil){
                System.out.println(eszkozok.get(i));
            }
        }
    }

    public void rendezes(){
        ArrayList<Eszkoz> eszkoz1 = new ArrayList<>(eszkozok.values());
        Collections.sort(eszkoz1,(e1, e2) ->{
            if(e1 instanceof Mobil &&  e2 instanceof Szamitogep){
                return -1;
            }
            if(e1 instanceof Szamitogep &&  e2 instanceof Mobil){
                return 1;
            }
            if (e1 instanceof Mobil &&  e2 instanceof Mobil){
                return e1.getOprendszer().compareTo(e2.getOprendszer());
            }
            if(e1 instanceof Szamitogep &&  e2 instanceof Szamitogep){
                return Double.compare(((Szamitogep) e1).getHDmeret(),((Szamitogep) e2).getHDmeret());
            }
            return 0;
        });
    }
}
