import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    private Books books;
    private Borrower borrower;

    @Before
    public void before(){
        books = new Books("LOTR", "JRR Tolkein", "Famtasy");
        borrower = new Borrower();
    }

    @Test
    public void canLendBook(){
        books.addToCollection(borrower);
        assertEquals(1, books.collectionCount());
    }

}
