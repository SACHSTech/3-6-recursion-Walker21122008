package recursion;

public class countChar {
    public static int countChar(String s, char c){
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == c) {
            return 1 + countChar(s.substring(1), c);
        } else {
            return countChar(s.substring(1), c);
        }
    }

    public static void main(String[] args) {
        System.out.println(countChar("Hatsune Miku", 'u'));
    }
}
