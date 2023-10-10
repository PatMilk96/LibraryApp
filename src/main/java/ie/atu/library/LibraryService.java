package ie.atu.library;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibraryService {
    public List<Book> getBooks() {
        List<Book> books = List.of(
          new Book("My Book", "Myself", 18091996, 2023)
        );
        return books;
    }

    public void addBook(Book book) {

    }
}
