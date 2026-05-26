package oop.labor13;

import oop.labor13.parcialis_minta_3.BookLibrary;

public class Main {
    public static void main(String[] args) {
        BookLibrary book = new BookLibrary("input.txt");

        book.print();

        System.out.println("************************ Search: Java **************************");
        book.SearchItem("Java");

        System.out.println("************************ FIND **************************");
        System.out.println(book.find("9-7807-6458-8747"));

        System.out.println("************************ OLDESTBOOK **************************");
        System.out.println(book.oldestBook());

        System.out.println("************************ COUNTPAGES **************************");
        System.out.println(book.countPages());

        System.out.println("************************ LONGESTBOOK **************************");
        System.out.println(book.longestBook(2005,2012));

        System.out.println("************************ SORT **************************");
        book.sortByTitleAndYear();

        book.print();
    }
}
