package Assessment;
import java.util.Scanner;
public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Room Type (Single/Double): ");
        String roomType = scanner.nextLine();

        System.out.print("Enter Number of Days: ");
        int numberOfDays = scanner.nextInt();

        if (age < 18) {
            System.out.println("Error: Age must be at least 18.");
        } else if (numberOfDays <= 0) {
            System.out.println("Error: Number of days must be greater than 0.");
        } else if (!roomType.equalsIgnoreCase("Single") && !roomType.equalsIgnoreCase("Double")) {
            System.out.println("Error: Invalid room type. Choose either 'Single' or 'Double'.");
        } else {
            Booking booking = new Booking(name, age, roomType, numberOfDays);
            booking.displayBookingDetails();
        }

        scanner.close();
    }
}
