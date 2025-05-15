package recursion;

public class countChar {
    public static int countChar(String s, char c){

        //base case
        if (s == null || s.length() == 0) {
            return 0;
        }

        //recursive case
        if (s.charAt(0) == c) {
            return 1 + countChar(s.substring(1), c);
        }
        return countChar(s.substring(1), c);
        
    }

    public static void main(String[] args) {
        System.out.println(countChar("Hatsune Miku", 'u'));
    }
}
