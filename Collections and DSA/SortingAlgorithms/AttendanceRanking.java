import java.util.*;

public class AttendanceRanking {

    static class Employee {

        int id;
        int attendance;

        Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
    }

    public static int[] topKEmployees(int ids[], int attendance[], int k) {

        int n = ids.length;

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++)
            emp[i] = new Employee(ids[i], attendance[i]);

        Arrays.sort(emp, (a, b) -> {

            if (a.attendance != b.attendance)
                return b.attendance - a.attendance;

            return a.id - b.id;
        });

        int ans[] = new int[k];

        for (int i = 0; i < k; i++)
            ans[i] = emp[i].id;

        return ans;
    }

    public static void main(String args[]) {

        int employeeIds[] = {101, 102, 103, 104, 105};
        int attendance[] = {92, 85, 98, 92, 80};
        int k = 3;

        int result[] = topKEmployees(employeeIds, attendance, k);

        System.out.println(Arrays.toString(result));
    }
}