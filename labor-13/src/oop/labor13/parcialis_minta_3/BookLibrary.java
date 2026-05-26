package oop.labor13.parcialis_minta_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BookLibrary {
    private String name;
    Map<Integer, Author> authors = new HashMap<>();
    ArrayList<Book> books = new ArrayList<>();

    public BookLibrary(String path){
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()) {
                    String[] items = line.split(",");
                    int id = Integer.parseInt(items[0].trim());
                    String lName = items[1].trim();
                    String fName = items[2].trim();
                    int year = Integer.parseInt(items[3].trim());
                    int month = Integer.parseInt(items[4].trim());
                    int day = Integer.parseInt(items[5].trim());
                    authors.put(id, new Author(id, lName, fName, new MyDate(day, month, year)));
                } else {
                    break;
                }
            }
                while (scanner.hasNextLine()) {
                    String line1 = scanner.nextLine();
                    if (!line1.isEmpty()) {
                        String[] items = line1.split(",");
                        if (items.length == 6) {
                            String isbn = items[0].trim();
                            String title = items[1].trim();
                            int authorId = Integer.parseInt(items[2].trim());
                            int year = Integer.parseInt(items[3].trim());
                            int pages = Integer.parseInt(items[4].trim());
                            String url = items[5].trim();
                            books.add(new EBook(isbn,title,authorId,year,pages,url));
                        }
                        else{
                            String isbn = items[0].trim();
                            String title = items[1].trim();
                            int authorId = Integer.parseInt(items[2].trim());
                            int year = Integer.parseInt(items[3].trim());
                            int pages = Integer.parseInt(items[4].trim());
                            books.add(new Book(isbn,title,authorId,year,pages));
                        }

                    }
                }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void addBook(String isbn, String title, int authorId, int year, int pages){
        books.add(new Book(isbn,title,authorId,year,pages));
    }

    public void print(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
    }

    public void SearchItem(String searchitem){
        ArrayList<Book> ujbook = new ArrayList<>();
        for (int i = 0; i < books.size(); i++){
            if(books.get(i).getIsbn().equals(searchitem)){
                ujbook.add(books.get(i));
            }

            if(books.get(i).getTite().contains(searchitem)){
                ujbook.add(books.get(i));
            }

            if(authors.get(books.get(i).getAuthorId()).getfName().equals(searchitem)){
                ujbook.add(books.get(i));
            }

            if(authors.get(books.get(i).getAuthorId()).getlName().equals(searchitem)){
                ujbook.add(books.get(i));
            }
        }
        System.out.println(ujbook.toString());
    }

    public Book find(String isbn){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)){
                return books.get(i);
            }
        }
        return null;
    }

    public Book oldestBook(){
        int min = 999999, hely = -1;
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getYear() < min){
                min = books.get(i).getYear();
                hely = i;
            }
        }
        if(hely != -1) {
            return books.get(hely);
        }
        else {
            return null;
        }
    }

    public int countPages(){
        int szum=0;
        for (int i = 0; i < books.size(); i++) {
            szum = szum + books.get(i).getPages();
        }
        return szum;
    }

    public Book longestBook(int minYear, int maxYear){
        Book mentett = new Book("","",0,0,0);
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getYear() >= minYear && books.get(i).getYear() <= maxYear){
                if(books.get(i).getPages() > mentett.getPages()){
                    mentett = books.get(i);
                }
            }
        }
        return mentett;
    }

    public void sortByTitleAndYear(){

        Collections.sort(books,(e1,e2) -> {
            if(!e1.getTite().equals(e2.getTite())){
                return e1.getTite().compareTo(e2.getTite());
            }
            else{
                return e1.getYear() - e2.getYear();
            }
        });
    }
}
