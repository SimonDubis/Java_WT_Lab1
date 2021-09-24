package classes_and_objects.lab12.comparators;

import classes_and_objects.lab12.classes.Book;

import java.util.Comparator;

public class SortByAuthorThenTitleThenPrice implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int temp = book1.getAuthor().compareTo(book2.getAuthor());
        if (temp == 0) {
            temp = book1.getTitle().compareTo(book2.getTitle());
            if (temp == 0) {
                if (book1.getPrice() == book2.getPrice()) {
                    temp = 0;
                } else {
                    temp = book1.getPrice() < book2.getPrice() ? -1 : 1;
                }
            }
        }
        return temp;
    }
}
