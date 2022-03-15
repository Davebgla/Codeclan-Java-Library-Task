import java.util.ArrayList;

public class Library {

    private Integer capacity;
    private ArrayList<Books> count;


    public Library(int capacity){
        this.capacity = capacity;
        this.count = new ArrayList<>();
    }

    public int booksCount(){
        return this.count.size();
    }


    public void addBook(Books books) {
        if (this.booksCount() < this.capacity){
            this.count.add(books);
        }
    }


}
