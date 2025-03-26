package Assessment;
import java.util.Scanner;
public class MovieTicketBooking {
    private String name;
    private int age;
    private String movieName;
    private int numberOfTickets;
    private static final int TICKET_PRICE = 200;

    public MovieTicketBooking(String name, int age, String movieName, int numberOfTickets) {
        this.name = name;
        this.age = age;
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
    }

    public void processBooking() {
        if (age < 10) {
            System.out.println("Booking Denied: Age must be at least 10.");
        } else if (numberOfTickets <= 0) {
            System.out.println("Booking Denied: Number of tickets must be greater than 0.");
        } else {
            int totalCost = numberOfTickets * TICKET_PRICE;
            System.out.println("Booking Confirmed!");
            System.out.println("Name: " + name);
            System.out.println("Movie: " + movieName);
            System.out.println("Number of Tickets: " + numberOfTickets);
            System.out.println("Total Cost: ₹" + totalCost);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = scanner.nextInt();

        MovieTicketBooking booking = new MovieTicketBooking(name, age, movieName, numberOfTickets);
        booking.processBooking();

        scanner.close();
    }
}
