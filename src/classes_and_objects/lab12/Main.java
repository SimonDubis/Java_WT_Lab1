package classes_and_objects.lab12;

import classes_and_objects.lab12.classes.Book;
import classes_and_objects.lab12.classes.ProgrammerBook;
import classes_and_objects.lab12.comparators.SortByAuthorThenTitleThenPrice;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book.setEdition(4);

        Book book1 = new Book("Hard Road", "George Orwell", 50, 2);
        Book book2 = new Book("Easy Road", "George Orwell", 50, 5);
        Book book3 = new Book("New Road", "George Orwell", 25, 1);
        Book book4 = new Book("New Road", "George Lorwell", 25, 3);
        Book book5 = new Book("New Road", "George Lorwell", 12, 4);

        SortByAuthorThenTitleThenPrice bookComp = new SortByAuthorThenTitleThenPrice();

        TreeSet<Book> bookSet = new TreeSet<Book>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println(bookSet);
    }
}
