import java.io.IOException;
import java.util.ArrayList;

public class BookStore {

    private String name;
    private String address;
    private int sqFt;
    private String hasUsedBooks;
    private String scheduleDays;
    private String scheduleTimes;
    private ArrayList<String> titles;
    
    public BookStore(String name, String address, int sqFt, String hasUsedBooks, String scheduleDays, String scheduleTimes) {
        this.name = name;
        this.address = address;
        this.sqFt = sqFt;
        this.hasUsedBooks = hasUsedBooks;
        this.scheduleDays = scheduleDays;
        this.scheduleTimes = scheduleTimes;
        titles = new ArrayList<String>();
        loadTitles();
        setTitles(titles);
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {

            System.out.println("")
        }
    }

    public String getScheduleDays() {
        return scheduleDays;
    }

    public void setScheduleDays() {
        this.scheduleDays = scheduleDays;
    }
}