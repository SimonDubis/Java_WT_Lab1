package classes_and_objects.lab12.comparators;

import classes_and_objects.lab12.classes.Book;

import java.util.Comparator;

public class SortByAuthorThenTitle implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int temp = book1.getAuthor().compareTo(book2.getAuthor());
        if (temp == 0) {
            return book1.getTitle().compareTo(book2.getTitle());
        }
        return temp;
    }
}
