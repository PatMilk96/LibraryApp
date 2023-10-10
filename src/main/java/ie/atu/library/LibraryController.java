package ie.atu.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return libraryService.getBooks();
    }

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book){
        libraryService.addBook(book);
    }
}