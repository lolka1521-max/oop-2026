package oop.labor13.parcialis_minta_3;

public class Book {
    private String isbn;
    private String title;
    private int authorId;
    private int year;
    private int pages;

    public Book(String isbn, String title, int authorId, int year, int pages){
        this.isbn = isbn;
        this.title = title;
        this.authorId = authorId;
        this.year = year;
        this.pages = pages;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public String getTite(){
        return this.title;
    }

    public int getAuthorId(){
        return this.authorId;
    }

    public int getYear(){
        return this.year;
    }

    public int getPages(){
        return this.pages;
    }

    @Override
    public String toString(){
        return isbn + " " + title + " " + authorId + " " + title + " " + pages + "\n";
    }
}
