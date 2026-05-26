package oop.labor13.parcialis_minta_3;

public class Author {
    private int id;
    private String lName;
    private String fName;
    MyDate birthdate;

    public Author(int id, String lName, String fName, MyDate birthdate){
        this.id = id;
        this.lName = lName;
        this.fName = fName;
        this.birthdate = birthdate;
    }

    public int getId(){
        return this.id;
    }

    public String getlName(){
        return this.lName;
    }

    public String getfName(){
        return fName;
    }

    public MyDate getBirthDate(){
        return this.birthdate;
    }

    @Override
    public String toString(){
        return id + " " + lName + " " + fName + " " + birthdate + "\n";
    }
}
