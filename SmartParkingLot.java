import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmartParkingLot {
    public static void main(String[] args) {
        Set<ParkingPass> activePasses = new HashSet<>();

        activePasses.add(new ParkingPass("PASS-101","Alex",1));
        activePasses.add(new ParkingPass("PASS-201","Marta",2));
        activePasses.add(new ParkingPass("PASS-101","Alexander",1));

        System.out.println("Count of active Passes: " + activePasses.size());

    }
}
