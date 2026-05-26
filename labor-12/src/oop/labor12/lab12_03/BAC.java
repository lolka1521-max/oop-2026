package oop.labor12.lab12_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BAC {
    private Map<Integer,Student> students = new HashMap<>();

    public BAC(String names){
        try {
            Scanner scanner = new Scanner(new File(names));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line != null){

                    String items[] = line.split(" ");
                    int id = Integer.parseInt(items[0].trim());
                    String fName = items[1].trim();
                    String lName = items[2].trim();
                    students.put(id, new Student(id,lName,fName));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void Subject(String subject){
        try {
            Scanner scanner = new Scanner(new File(subject));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line != null) {

                    String items[] = line.split(" ");
                    int id = Integer.parseInt(items[0].trim());
                    double grade = Double.parseDouble(items[1].trim());

                    Student s = students.get(id);
                    s.addGrades(subject,grade);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void computeAvarage(){
        for (Student s : students.values()){
            System.out.println("ID " + s.getId());
            System.out.println("Az erettsegi atlaga ha 0 akkor nem sikerult ha pedig 6 oson feluli akkor sikeres volt. " + s.computeAvarage());
            System.out.println("--------------------");
        }
    }

    public void whoPassed(){
        int counter = 0;
        for (Student s : students.values()){
            if(s.getAvarage() != 0)
            {
                counter++;
            }
        }
        System.out.println(counter + " Ennyi diak ment at a BAC-on");
    }

    public void alphabeticalOrder(){
        ArrayList<Student> abcOrder = new ArrayList<>();
        for (Student s : students.values()){
            if(s.getAvarage() == 0)
            {
                abcOrder.add(s);
            }
        }
        abcOrder.sort((s1,s2) -> {
            if(s1.getlName().compareTo(s2.getlName()) != 0){
                return s1.getlName().compareTo(s2.getlName());
            }
            return s1.getfName().compareTo(s2.getfName());
        });
        System.out.println(abcOrder);
    }

}
