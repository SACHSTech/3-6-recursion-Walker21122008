package recursion;

public class isPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }else{
            if(s.substring(0,1).equalsIgnoreCase(s.substring(s.length()-1,s.length()))){
                return isPalindrome(s.substring(1,s.length()-1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

}
