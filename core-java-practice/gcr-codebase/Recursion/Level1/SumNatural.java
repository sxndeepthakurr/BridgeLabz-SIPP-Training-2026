class SumNatural {
    static int s(int n){
        if(n==0) return 0;
        return n+s(n-1);
    }
    public static void main(String[] args){
        System.out.println(s(5));
    }
}