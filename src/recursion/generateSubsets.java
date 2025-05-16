package recursion;

public class generateSubsets {
    public static void generateSubsets(String s) {
        generateSubsets(s, "", 0);
    }

    private static void generateSubsets(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        generateSubsets(s, current + s.charAt(index), index + 1);
        generateSubsets(s, current, index + 1);
    }

    public static void main(String[] args) {
        generateSubsets("abc");
    }
}
