package com.company;

import java.util.ArrayList;

public class Tasks9 {

    public static void main(String[] args){

        System.out.println( (int) 'a' );
        int length = 10;
        String[] titles = new String[]     {  "a",  "b",  "b",  "b",  "a",  "c",  "c",  "b",  "a",  "b"};
        String[] authors = new String[]    {  "b",  "a",  "a",  "b",  "c",  "a",  "b",  "c",  "c",  "a"};
        String[] publishers = new String[] {  "c",  "c",  "c",  "a",  "a",  "c",  "b",  "b",  "b",  "b"};
        int[] publishYears = new int[]     { 2021, 2018, 2024, 2010, 2008, 2000, 2005, 2025, 2028, 2016 };
        int[] pagesCount = new int[]       { 1000, 3000, 2000, 6000, 2000, 3000, 2000, 4000, 4000, 9000 };

        Library l = new Library();
        for (int i = 0; i < length; i++) l.addBook(titles[i], authors[i], publishers[i], publishYears[i], pagesCount[i]);

        l.sortBooksByPagesCount();
        for (int i = 0; i < length; i++) System.out.print(l.getBookByIndex(i).title + ", ");
        System.out.println();

        Book foundBooks = l.findBooksByAuthorName("a");
        System.out.print(foundBooks.title);
    }

    public static int getASCII(char ch){
        return (int) ch;
    }

}

class Book {

    public String title;
    public String authorName;
    public String publisherName;
    public int publishYear;
    public int pagesCount;

    public static int allBooksCount = 0;

    {
        ++allBooksCount;
    }

    Book(){
        this.title = "No Title";
        this.authorName = "No Author";
        this.publisherName = "";
        this.publishYear = 0;
        this.pagesCount = 0;
    }

    Book(String title, String authorName, String publisherName, int publishYear, int pagesCount){
        this.title = title;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.publishYear = publishYear;
        this.pagesCount = pagesCount;
    }

}

class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    {

    }

    Library(){

    }

    public void addBook(String title, String authorName, String publisherName, int publishYear, int pagesCount){
        books.add(new Book(title, authorName, publisherName, publishYear, pagesCount));
    }

    public Book getBookByIndex(int i){
        return books.get(i);
    }

    public Book findBooksByAuthorName(String authorName){

        for (int i = 0; i < books.size(); i++)
            if(books.get(i).authorName == authorName)
                return new Book(books.get(i).title, books.get(i).authorName, books.get(i).publisherName, books.get(i).publishYear, books.get(i).pagesCount);

        return new Book();
    }

    public Book findBooksByTitle(String title){

        for (int i = 0; i < books.size(); i++)
            if(books.get(i).title == title)
                return new Book(books.get(i).title, books.get(i).authorName, books.get(i).publisherName, books.get(i).publishYear, books.get(i).pagesCount);

        return new Book();
    }

    public Book findBooksByPublicationYear(int publishYear){

        for (int i = 0; i < books.size(); i++)
            if(books.get(i).publishYear == publishYear)
                return new Book(books.get(i).title, books.get(i).authorName, books.get(i).publisherName, books.get(i).publishYear, books.get(i).pagesCount);

        return new Book();
    }

    public void sortBooksByTitle(){

        for (int i = 0; i < books.size()-1; i++) {
            for (int j = 0; j < books.size()-i-1; j++) {
                if(Tasks9.getASCII(books.get(j).title.charAt(0))  < Tasks9.getASCII(books.get(j+1).title.charAt(0))){
                    String t = books.get(j).title;
                    books.get(j).title = books.get(j+1).title;
                    books.get(j+1).title = t;
                }
            }
        }


    }

    public void sortBooksByPublicationYear(){

        for (int i = 0; i < books.size()-1; i++) {
            for (int j = 0; j < books.size()-i-1; j++) {
                if(books.get(j).publishYear > books.get(j+1).publishYear){
                    int t = books.get(j).publishYear;
                    books.get(j).publishYear = books.get(j+1).publishYear;
                    books.get(j+1).publishYear = t;
                }
            }
        }

    }

    public void sortBooksByPagesCount(){

        for (int i = 0; i < books.size()-1; i++) {
            for (int j = 0; j < books.size()-i-1; j++) {
                if(books.get(j).pagesCount > books.get(j+1).pagesCount){
                    int t = books.get(j).pagesCount;
                    books.get(j).pagesCount = books.get(j+1).pagesCount;
                    books.get(j+1).pagesCount = t;
                }
            }
        }

    }

}