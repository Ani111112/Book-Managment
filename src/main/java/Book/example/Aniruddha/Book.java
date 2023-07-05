package Book.example.Aniruddha;
//Create an author and book management system which can help us easily to perform CRUD operations.
//        POST :Add book(been there), add author
//        GET : the bookName with highest no. of pages.
//        PUT the (path bookname, updated pages);
//        GET author who has written the highest no. of pages
public class Book {
    private String bookName;
    private int bookPages;
    private String authorName;


    public Book() {
    }

    public Book(String bookName, int bookPages, String authorName) {
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
