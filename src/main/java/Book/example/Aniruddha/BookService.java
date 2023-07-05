package Book.example.Aniruddha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public boolean addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public boolean addAuthor(Author author) {
        return bookRepository.addAuthor(author);
    }

    public boolean addAuthorToBook() {
        return bookRepository.addAuthorToBook();
    }

    public String updatePAges(int page, Book book) {
        return bookRepository.updatePAges(page, book);
    }

    public Book getBook() {
        return bookRepository.getBook();
    }

    public String getAuthor() {
        return bookRepository.getAuthor();
    }
}
