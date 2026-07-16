interface HeartRateMonitor {

    default void displayHealthTips() {
        System.out.println("Heart Tip: Exercise regularly.");
    }

    void showHeartRate();

    static boolean isPatientIdValid(String patientId) {
        return patientId != null && patientId.length() == 5;
    }
}

interface TemperatureMonitor {

    default void displayHealthTips() {
        System.out.println("Temperature Tip: Drink enough water.");
    }

    void showTemperature();
}

public class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {

    String[] patientNames = {"Rahul", "Sneha", "Vikas"};
    String[] patientIds = {"P1001", "P20", "P3003"};

    int[] heartRates = {72, 88, 79};
    double[] temperatures = {98.6, 101.2, 99.1};

    @Override
    public void showHeartRate() {
        System.out.println("Heart Rate Monitor Activated.");
    }

    @Override
    public void showTemperature() {
        System.out.println("Temperature Monitor Activated.");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public void generateReport() {

        displayHealthTips();

        System.out.println("\nFinal Health Report");

        for (int i = 0; i < patientNames.length; i++) {

            showHeartRate();
            showTemperature();

            boolean valid = HeartRateMonitor.isPatientIdValid(patientIds[i]);

            System.out.println("\nPatient Name : " + patientNames[i]);
            System.out.println("Patient ID   : " + patientIds[i]);

            if (valid)
                System.out.println("ID Status    : Valid");
            else
                System.out.println("ID Status    : Invalid");

            System.out.println("Heart Rate   : " + heartRates[i] + " bpm");
            System.out.println("Temperature  : " + temperatures[i] + " °F");
        }
    }

    public static void main(String[] args) {

        HealthMonitoringSystem obj = new HealthMonitoringSystem();
        obj.generateReport();
    }
}
