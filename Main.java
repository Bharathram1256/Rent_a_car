package Renting_a_car;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the ride distance (in km): ");
        double rideDistance = scan.nextDouble();

        scan.nextLine();
        System.out.print("Enter the requested car model: ");
        String carModel = scan.next();

        scan.close();

        Driver driver = new Driver();
        driver.print();

        String selectedDriver = null;
        double minDistance = 9999999;

        for (int i = 0; i < 5; i++) {
            if (driver.carModels[i].equalsIgnoreCase(carModel) && driver.ratings[i] >= 4.0 && driver.distancesFromCustomer[i] < minDistance) {
                selectedDriver = driver.driverNames[i];
                minDistance = driver.distancesFromCustomer[i];
            }
        }

        if (selectedDriver != null) {
            System.out.println("Driver " + selectedDriver + " will get you to the destination.");
            double totalCharge = rideDistance * 8.0;
            System.out.println("Your charge will be Rs " + totalCharge);
        } else {
            System.out.println("No eligible driver found for the requested car.");
        }
    }
}
