import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> stock;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if (this.checkCapacity()) {
            this.stock.add(book);
        }
    }
    public Book checkOutBook(){
        return this.stock.remove(0);
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean checkCapacity() {
        if (this.stockCount() < this.capacity) {
            return true;
        } else {
            return false;
        }
    }
}