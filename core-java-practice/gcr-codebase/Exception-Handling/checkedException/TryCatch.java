package checkedException;
public class TryCatch {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Hello Sandeep Sisodiya");
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");
    }
}
