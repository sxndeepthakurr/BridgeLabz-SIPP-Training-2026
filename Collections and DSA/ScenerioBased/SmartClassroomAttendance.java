import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendance {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate Attendance Not Allowed.");
        }
    }

    static void displayAttendance() {

        System.out.println("\nAttendance Report:");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total Students: " + students.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Rahul");
        markAttendance("Java", "Ankit");
        markAttendance("Java", "Rahul");

        markAttendance("Python", "Riya");
        markAttendance("Python", "Rahul");

        displayAttendance();
    }
}