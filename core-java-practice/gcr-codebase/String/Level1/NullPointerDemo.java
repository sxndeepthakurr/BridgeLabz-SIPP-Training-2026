public class NullPointerDemo {

    static void show() {
        try {
            String t = null;
            System.out.println(t.length());
        } catch (NullPointerException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        show();
    }
}