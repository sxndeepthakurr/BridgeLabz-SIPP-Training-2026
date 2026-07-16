public class TransportCompany {

    static class Vehicle {
        String vehicleNo;

        Vehicle(String vehicleNo) {
            this.vehicleNo = vehicleNo;
        }

        double fuelCost(int km) {
            return 0;
        }
    }

    static class Car extends Vehicle {
        Car(String vehicleNo) {
            super(vehicleNo);
        }

        double fuelCost(int km) {
            return km * 8;
        }
    }

    static class Bus extends Vehicle {
        Bus(String vehicleNo) {
            super(vehicleNo);
        }

        double fuelCost(int km) {
            return km * 15;
        }
    }

    static class Bike extends Vehicle {
        Bike(String vehicleNo) {
            super(vehicleNo);
        }

        double fuelCost(int km) {
            return km * 3;
        }
    }

    static class ElectricCar extends Vehicle {
        ElectricCar(String vehicleNo) {
            super(vehicleNo);
        }

        double fuelCost(int km) {
            return km * 2;
        }
    }

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("C101"),
                new Bus("B201"),
                new Bike("BK301"),
                new ElectricCar("E401")
        };

        int km = 20;

        for (Vehicle v : fleet) {

            if (v instanceof Car) {
                System.out.println("Car Cost = " + ((Car) v).fuelCost(km));
            } else if (v instanceof Bus) {
                System.out.println("Bus Cost = " + ((Bus) v).fuelCost(km));
            } else if (v instanceof Bike) {
                System.out.println("Bike Cost = " + ((Bike) v).fuelCost(km));
            } else if (v instanceof ElectricCar) {
                System.out.println("Electric Car Cost = " + ((ElectricCar) v).fuelCost(km));
            }
        }
    }
}