abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
    }
}

class Car extends Vehicle {

    private double dailyRate;

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicleNumber("UP81A1234");
        car.setVehicleType("Car");
        car.setDailyRate(1500);

        Bike bike = new Bike();
        bike.setVehicleNumber("UP81B5678");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();
        truck.setVehicleNumber("UP81T9999");
        truck.setVehicleType("Truck");
        truck.setDailyRate(3000);
        truck.setLoadingCharge(1000);

        int days = 5;

        car.displayVehicleInfo();
        System.out.println("Rental Cost : " + car.calculateRentalCost(days));

        System.out.println();

        bike.displayVehicleInfo();
        System.out.println("Rental Cost : " + bike.calculateRentalCost(days));

        System.out.println();

        truck.displayVehicleInfo();
        System.out.println("Rental Cost : " + truck.calculateRentalCost(days));
    }
}