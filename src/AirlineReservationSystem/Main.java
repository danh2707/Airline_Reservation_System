package AirlineReservationSystem;

        import java.util.Scanner;

        import static AirlineReservationSystem.AirlineReservation.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Airline Reservation System Menu:");
            System.out.println("1. Add reservation.");
            System.out.println("2. Modify passenger records.");
            System.out.println("3. Display passenger records.");
            System.out.println("4. Exit.");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addReservation(sc);
                    break;
                case 2:
                    modifyPassengerRecord(sc);
                    break;
                case 3:
                    displayPassengerRecords();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

}
