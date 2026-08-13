import java.util.*;

public class SmartParkingLot {
    public static void main(String[] args) {
        System.out.println("=== 1. TESTING VEHICLES & INTERFACES ===");

        // Creating class instances
        Tesla tesla = new Tesla("Model S", 250, 100);
        EScooter scooter = new EScooter("Xiaomi Pro", 25);

        // Checking Overrides & "drive-methods"
        tesla.move();
        scooter.move();

        // Checking Electric interface implementation
        tesla.chargeBattery();
        scooter.chargeBattery();

        // Checking interface GPSNavigable (Supported by Tesla only)
        tesla.navigateTo("Parking Zone A");

        System.out.println("\n=== 2. TESTING PARKING PASSES & HASHSET ===");

        // Testing pass validation & deduplication
        Set<ParkingPass> activePasses = new HashSet<>();

        activePasses.add(new ParkingPass("PASS-101", "Alex", 1));
        activePasses.add(new ParkingPass("PASS-201", "Marta", 2));
        activePasses.add(new ParkingPass("PASS-101", "Alexander", 1)); // Duplicate by ID

        System.out.println("Total active passes (Expected 2): " + activePasses.size());

        // Testing Parking Zone Distribution by Map & HashMap
        System.out.println("\n=== 3. TESTING PARKING ZONES & HASHMAP ===");

        Map<Integer, List<Vehicle>> parkingZones =  new HashMap<>();

        // "Parking" tesla & new scooter in Zone 1
        parkingZones.computeIfAbsent(1, k -> new ArrayList<>()).add(tesla);
        parkingZones.computeIfAbsent(1, k -> new ArrayList<>()).add(new EScooter("Ninebot", 20));

        // "Parking" scooter in Zone 2
        parkingZones.computeIfAbsent(2, k -> new ArrayList<>()).add(scooter);

        // Checking Zone 1 Size
        System.out.println("Vehicles in Zone 1 (Expected 2): " + parkingZones.get(1).size());
        System.out.println("Vehicles in Zone 2 (Expected 1): " + parkingZones.get(2).size());

        // Creating total Count of Vehicles in the Parking Lot
        int totalVehicleCount = countTotalVehicles(parkingZones);

        // Testing if Work was done right
        System.out.print("Total Vehicle Amount (Expected 3): " + totalVehicleCount);

        // Testing Vehicle Search & Operations
        System.out.println("\n=== 4. VEHICLE OPERATIONS & SEARCH ===");

        // "Unparking" a Tesla from Zone 1
        parkingZones.get(1).remove(tesla);
        System.out.println("Tesla " + tesla.getModel() + " has left Zone 1");

        // Recalculating total Vehicle Count
        totalVehicleCount = countTotalVehicles(parkingZones);

        // Checking Changes in Zone 1 Size and total Vehicle Count in the Parking lot
        System.out.println("Vehicles in Zone 1 (Expected 1): " + parkingZones.get(1).size());
        System.out.println("Total Vehicle Amount (Expected 2): " + totalVehicleCount);

        // Charging all electric vehicles / vl = Vehicle List; v = Vehicle; ev = Electro Vehicle
        for(List<Vehicle> vl : parkingZones.values()) {
            for(Vehicle v : vl) {
                if (v instanceof Electric ev) ev.chargeBattery();
            }
        }
    }

    // Appended method for counting Vehicle in the Parking Lot
    private static int countTotalVehicles(Map<Integer, List<Vehicle>> parkingZones) {
        int count = 0;
        for (List<Vehicle> zoneList : parkingZones.values()) {
            if (zoneList != null) count += zoneList.size();
        }
        return count;
    }
}

