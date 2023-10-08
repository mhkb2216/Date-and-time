import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDateTimeApp {
    public static void main(String[] args) {
        // Get the current date and time
        Date currentDateAndTime = new Date();

        // Create a SimpleDateFormat object to format the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time as a string
        String formattedDateTime = dateFormat.format(currentDateAndTime);

        // Display the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
