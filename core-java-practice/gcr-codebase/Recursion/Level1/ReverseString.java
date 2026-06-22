class ReverseString {
    static String r(String s){
        if(s.length()==0) return "";
        return r(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args){
        System.out.println(r("hello"));
    }
}
