public class EmployeeManagement {
    static String companyName = "ABC Pvt Ltd";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    EmployeeManagement(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        EmployeeManagement emp = new EmployeeManagement("Amit", 201, "Manager");

        if (emp instanceof EmployeeManagement) {
            emp.display();
        }

        displayTotalEmployees();
    }
}
