import java.util.ArrayList;
import java.util.Arrays;

public class Books {

    private String title;
    private String author;
    private String genre;
    private ArrayList<Borrower> collection;


    public Books(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.collection = new ArrayList<>();
    }


    public void addToCollection(Borrower borrower){
        this.collection.add(borrower);
    }

    public int collectionCount(){
        return this.collection.size();
    }

}
