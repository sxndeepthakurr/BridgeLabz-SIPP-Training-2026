class Palindrome {
    static boolean p(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return p(s,l+1,r-1);
    }
    public static void main(String[] args){
        String s="madam";
        System.out.println(p(s,0,s.length()-1)?"Palindrome":"Not Palindrome");
    }
}