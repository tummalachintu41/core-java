package Assessment;

public class Booking {
    private String name;
    private int age;
    private String roomType;
    private int numberOfDays;
    private double totalCost;

    public Booking(String name, int age, String roomType, int numberOfDays) {
        this.name = name;
        this.age = age;
        this.roomType = roomType;
        this.numberOfDays = numberOfDays;
        this.totalCost = calculateCost();
    }

    private double calculateCost() {
        int costPerDay = roomType.equalsIgnoreCase("Single") ? 2000 : 3500;
        return costPerDay * numberOfDays;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Confirmed!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Cost: ₹" + totalCost);
    }
}
