import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTests {

    private Books books;
    private Library library;
    private Borrower borrower;


    @Before
    public void before() {
        library = new Library(200);
        books = new Books("LOTR", "JRR Tolkein", "Fantasy");
        borrower = new Borrower();
    }

    @Test
    public void startsWithNoBooks() {
        assertEquals(0, library.booksCount());
    }


    @Test
    public void CheckIfStockFull() {
        library.addBook(books);
        assertEquals(1, library.booksCount());
    }


}
