package nvb.dev.builder;

import java.time.LocalDate;

public class BuilderTest {
    public static void main(String[] args) {

        Book book1 = new Book.Builder("0-12-345678-9", "Java")
                .author("John").build();
        System.out.println(book1);

        Book book2 = new Book.Builder("0-12-345678-9", "Mockito")
                .genre("Programming")
                .publishedYear(LocalDate.of(2019, 8, 12))
                .build();
        System.out.println(book2);

    }
}
