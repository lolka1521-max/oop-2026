package oop.labor13.parcialis_minta_3;

public class EBook extends Book {
    private String url;

    public EBook(String isbn, String title, int authorId, int year, int pages, String url){
        super(isbn,title,authorId,year,pages);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString(){
        return super.toString() + " " + url;
    }
}
