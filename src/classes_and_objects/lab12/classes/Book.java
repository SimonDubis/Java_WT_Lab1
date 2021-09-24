package classes_and_objects.lab12.classes;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "\n(" + title + "," + author + "," + price + "," + edition + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.getPrice() &&
                (title != null && title.equals(book.getTitle())) &&
                (author != null && author.equals(book.getAuthor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + price;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        return result;
    }

    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int compareTo(Book book) {
        return this.isbn - book.isbn;
    }
}