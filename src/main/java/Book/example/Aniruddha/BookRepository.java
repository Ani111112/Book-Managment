package Book.example.Aniruddha;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Repository
public class BookRepository {
    HashMap<String, Book> bookDB = new HashMap<>();
    HashMap<String, List<Book>> authorDB = new HashMap<String, List<Book>>();
    public boolean addBook(Book book) {
        String bookName = book.getBookName();
        if (!bookDB.containsKey(bookName)) {
            bookDB.put(bookName, book);
            return true;
        }else return false;
    }

    public boolean addAuthor(Author author) {
        String authorName = author.getNameOfAuthor();
        if (!authorDB.containsKey(authorName)) {
            List<Book> list = new ArrayList<>();
            authorDB.put(authorName, list);
            return true;
        }else return false;
    }

    public boolean addAuthorToBook() {
        for (String key : bookDB.keySet()) {
            Book book = bookDB.get(key);
            String authorName = book.getAuthorName();
            List<Book> bookList = authorDB.get(authorName);
            bookList.add(book);
            authorDB.put(authorName, bookList);

        }
        return true;
    }

    public String updatePAges(int page, Book book) {
        String bookName = book.getBookName();
        Book book1 = bookDB.get(bookName);
        book1.setBookPages(page);
        bookDB.put(bookName, book1);
        return "Done";
    }

    public Book getBook() {
        List<Book> bookList = new ArrayList<>();
        for (String key : bookDB.keySet()) {
            bookList.add(bookDB.get(key));
        }
        Collections.sort(bookList, (a,b)->{
            return b.getBookPages() - a.getBookPages();
        });
        return bookList.get(0);
    }

    public String getAuthor() {
        String author = null;
        int maxSize = 0;
        for (String key : authorDB.keySet()) {
            if (authorDB.get(key).size() > maxSize) {
                author = key;
                maxSize = authorDB.get(key).size();
            }
        }
        return author;
    }
}
