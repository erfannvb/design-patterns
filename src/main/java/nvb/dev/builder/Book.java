package nvb.dev.builder;

import java.time.LocalDate;

public class Book {

    // Mandatory
    private final String isbn;
    private final String title;

    // Optional
    private final String genre;
    private final String author;
    private final LocalDate publishedYear;

    private Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.genre = builder.genre;
        this.author = builder.author;
        this.publishedYear = builder.publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishedYear() {
        return publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }

    public static class Builder {

        private final String isbn;
        private final String title;
        private String genre;
        private String author;
        private LocalDate publishedYear;

        public Builder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder publishedYear(LocalDate publishedYear) {
            this.publishedYear = publishedYear;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }

}
