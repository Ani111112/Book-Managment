package Book.example.Aniruddha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book) {
        boolean res = bookService.addBook(book);
        if (res)return "Book Added Successfully";
        return "Book Already Exits";
    }

    @PostMapping("/add-author")
    public String addAuthor(@RequestBody Author author) {
        boolean res = bookService.addAuthor(author);
        if (res) return "Author added Successfully";
        return "Author Already Exits";
    }

    @PostMapping("/add-author-to-book")
    public String addAuthorToBook() {
        boolean res = bookService.addAuthorToBook();
        return "Book Added With Author";
    }

    @PutMapping("/update/page")
    public String updatePAges(@PathVariable("page") int page, Book book) {
        return bookService.updatePAges(page, book);
    }

    @GetMapping("/get-book")
    public Book getBook() {
        return bookService.getBook();
    }

    @GetMapping("/get-author")
    public String getAuthor() {
        return bookService.getAuthor();
    }
}
