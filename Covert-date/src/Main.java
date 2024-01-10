import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

 class ShortDateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDateInput = scanner.nextLine();
        try {
            SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdfInput.parse(shortDateInput);

            SimpleDateFormat sdfOutput = new SimpleDateFormat("MMMM dd, yyyy");
            String fullDateRepresentation = sdfOutput.format(date);

            System.out.println("Full Date Representation: " + fullDateRepresentation);

        } catch (ParseException e) {
            System.err.println("Invalid date format. Please enter a valid date in the format YYYY-MM-DD.");
        } finally {
            scanner.close();
        }
    }
}
