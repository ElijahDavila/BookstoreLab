import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        BookStore myBookStore = new BookStore();
        myBookStore.setHasUsedBooks("You bet");
        myBookStore.setName("The Dusty Spine");
        myBookStore.setsqFt(1000);
        myBookStore.setScheduleDays("Monday-Saturday");
        myBookStore.setScheduleTimes("10am-12pm");
        myBookStore.setAddress("1234 Ink Pen Way");

    }
}