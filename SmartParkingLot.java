import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmartParkingLot {
    public static void main(String[] args) {
        System.out.println("=== 1. TESTING VEHICLES & INTERFACES ===");

        // Creating class instances
        Tesla tesla = new Tesla("Model S", 250, 100);
        EScooter scooter = new EScooter("Xiaomi Pro", 25);

        // Checking Overrides and "drive-methods"
        tesla.move();
        scooter.move();

        // Checking Electric interface implementation
        tesla.chargeBattery();
        scooter.chargeBattery();

        // Checking interface GPSNavigable (Supported by Tesla only)
        tesla.navigateTo("Parking Zone A");

        System.out.println("\n=== 2. TESTING PARKING PASSES & HASHSET ===");

        // Testing pass validation and deduplication
        Set<ParkingPass> activePasses = new HashSet<>();

        activePasses.add(new ParkingPass("PASS-101", "Alex", 1));
        activePasses.add(new ParkingPass("PASS-201", "Marta", 2));
        activePasses.add(new ParkingPass("PASS-101", "Alexander", 1)); // Duplicate by ID

        System.out.println("Total active passes (Expected 2): " + activePasses.size());

    }
}
