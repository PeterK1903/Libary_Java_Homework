import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library("Pedro's Bookies", 4);
        book = new Book("Denial Is Not A River In Egypt", "Sandi Bachom","Medicine",1998);
    }
    @Test
    public void hasName(){
        assertEquals("Pedro's Bookies",library.getName());
    }

    @Test
    public void startsWithEmptyStock(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToStock_positive(){
        library.addBook(book);
        assertEquals(1,library.stockCount());
    }
    @Test
    public void hasCapacity(){
        assertEquals(4,library.getCapacity());
    }

    @Test
    public void canAddBookToStock_negative(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.stockCount());
    }

    @Test
    public void canCheckOutBook(){
        library.addBook(book);
        assertEquals(1,library.stockCount());
    }


}