package Book.example.Aniruddha;

import java.util.ArrayList;
import java.util.List;

//Create an author and book management system which can help us easily to perform CRUD operations.
//        POST :Add book(been there), add author
//        GET : the bookName with highest no. of pages.
//        PUT the (path bookname, updated pages);
//        GET author who has written the highest no. of pages
public class Author {
    private String nameOfAuthor;
    private List<Book> booksList;

    public Author() {
    }

    public Author(String nameOfAuthor, List<Book> booksList) {
        this.nameOfAuthor = nameOfAuthor;
        this.booksList = booksList;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }
}
