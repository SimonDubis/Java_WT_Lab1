package classes_and_objects.lab12.classes;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(Book book, String language, int level) {
        super(book.getTitle(), book.getAuthor(), book.getPrice(), book.getIsbn());
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + "; language: " + language + "; level: " + level;
    }

    @Override
    public boolean equals(Object obj) {
        ProgrammerBook programmerBook;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        programmerBook = (ProgrammerBook) obj;
        return super.equals(obj) && language.equals(programmerBook.language) && (programmerBook.level == level);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + super.hashCode();
        result = prime * result + level;
        return result;
    }
}