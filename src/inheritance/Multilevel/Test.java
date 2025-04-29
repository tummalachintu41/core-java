package inheritance.Multilevel;

public class Test {
        public static void main(String[] args) {
            // Create a Mobile object
            Mobile mobile = new Mobile("iphone",80000);

            System.out.println(" getDetails()");
            mobile.getDetails();

            // Call getDetails with currency
            System.out.println("Mobile Details:");
            mobile.getDetails("USD");
        }
    }
