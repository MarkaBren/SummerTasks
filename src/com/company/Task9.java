package com.company;

public class Task9 {

    public static void main(String[] args){
        System.out.println( (int) 'a' );
        int length = 10;
        String[] titles = new String[]     { "a", "b", "b", "b", "a", "c", "c", "b", "a", "b"};
        String[] authors = new String[]    { "b", "a", "a", "b", "c", "a", "b", "c", "c", "a"};
        String[] publishers = new String[] { "c", "c", "c", "a", "a", "c", "b", "b", "b", "b"};
        int[] publishYears = new int[]     { 2021, 2018, 2024, 2010, 2008, 2000, 2005, 2025, 2028, 2016 };
        int[] pagesCount = new int[]       { 1000, 3000, 2000, 6000, 2000, 3000, 2000, 4000, 4000, 9000 };

        Library l = new Library(length);
        for (int i = 0; i < length; i++) l.addBook(titles[i], authors[i], publishers[i], publishYears[i], pagesCount[i]);

        l.sortBooksByPagesCount();
        for (int i = 0; i < length; i++) System.out.print(l.findBookByIndex(i).title + ", ");
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
    private final Book[] books;
    private int booksCount = 0;

    {

    }

    Library(int bookCount){
        this.booksCount = bookCount;
        books = new Book[bookCount];
    }

    public void addBook(String title, String authorName, String publisherName, int publishYear, int pagesCount){
        books[booksCount] = new Book(title, authorName, publisherName, publishYear, pagesCount);
        booksCount++;
    }

    public Book findBookByIndex(int i){
        return books[i];
    }

    public Book findBooksByAuthorName(String authorName){

        for (int i = 0; i < books.length; i++)
            if(books[i].authorName == authorName)
                return new Book(books[i].title, books[i].authorName, books[i].publisherName, books[i].publishYear, books[i].pagesCount);

        return new Book();
    }

    public Book findBooksByTitle(String title){

        for (int i = 0; i < books.length; i++)
            if(books[i].title == title)
                return new Book(books[i].title, books[i].authorName, books[i].publisherName, books[i].publishYear, books[i].pagesCount);

        return new Book();
    }

    public Book findBooksByPublicationYear(int publishYear){

        for (int i = 0; i < books.length; i++)
            if(books[i].publishYear == publishYear)
                return new Book(books[i].title, books[i].authorName, books[i].publisherName, books[i].publishYear, books[i].pagesCount);

        return new Book();
    }

    public void sortBooksByTitle(){

        // sort string(Book.title) array alphabetically

        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1; j++) {
                if(Task9.getASCII(books[j].title.charAt(0))  < Task9.getASCII(books[j+1].title.charAt(0))){
                    String t = books[j].title;
                    books[j].title = books[j+1].title;
                    books[j+1].title = t;
                }
            }
        }


    }

    public void sortBooksByPublicationYear(){

        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1; j++) {
                if(books[j].publishYear < books[j+1].publishYear){
                    int t = books[j].publishYear;
                    books[j].publishYear = books[j+1].publishYear;
                    books[j+1].publishYear = t;
                }
            }
        }

    }

    public void sortBooksByPagesCount(){

        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1; j++) {
                if(books[j].pagesCount < books[j+1].pagesCount){
                    int t = books[j].pagesCount;
                    books[j].pagesCount = books[j+1].pagesCount;
                    books[j+1].pagesCount = t;
                }
            }
        }

    }

}