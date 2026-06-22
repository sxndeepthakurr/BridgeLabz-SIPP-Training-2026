class SensorReading {
    static boolean chk(int[] a, int i) {
        if (i == a.length - 1) return true;
        if (a[i] >= a[i + 1]) return false;
        return chk(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {12, 15, 18, 22, 30};
        System.out.println(chk(a, 0));
    }
}