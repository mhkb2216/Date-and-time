Current Date and Time Display Program

This Java application is a basic utility for displaying the current date and time in a specific format. It serves as a clear example of working with date and time in Java, employing standard Java libraries without any external dependencies.
How it Operates

    Import Essential Classes: The program initiates by importing two standard Java classes - java.util.Date and java.text.SimpleDateFormat. These classes are fundamental for managing date and time objects and formatting them into human-readable strings.

    Retrieve the Current Date and Time: The application employs the Date class to create a currentDateAndTime object, which captures the current date and time at the instance when the program runs.

    Define Date Format: A SimpleDateFormat object called dateFormat is instantiated. This object defines the desired output format for the date and time. In this instance, the format is specified as "yyyy-MM-dd HH:mm:ss," representing year, month, day, hour, minute, and second.

    Format the Date and Time: The program uses the dateFormat.format(currentDateAndTime) method to format the current date and time into a string based on the provided format. The formatted result is stored in the formattedDateTime variable.

    Display the Date and Time: Lastly, the application prints the formatted date and time to the console using the System.out.println() method. The output appears as "Current Date and Time: [formatted date and time]."

