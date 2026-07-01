import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void vehicleEntry(String regNo) {
        vehicles.add(regNo);
        System.out.println(regNo + " Entered Parking.");
    }

    static void vehicleExit(String regNo) {
        if (vehicles.remove(regNo))
            System.out.println(regNo + " Exited Parking.");
        else
            System.out.println("Vehicle Not Found.");
    }

    static void searchVehicle(String regNo) {
        if (vehicles.contains(regNo))
            System.out.println("Vehicle is Parked.");
        else
            System.out.println("Vehicle is Not Parked.");
    }

    static void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        vehicleEntry("UP32AB1234");
        vehicleEntry("DL10XY5678");

        searchVehicle("UP32AB1234");

        vehicleExit("DL10XY5678");

        displayVehicles();
    }
}