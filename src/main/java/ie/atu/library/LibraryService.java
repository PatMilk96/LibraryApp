package ie.atu.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class LibraryService {
    public ArrayList<Book> books = new ArrayList();

    public ArrayList getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
