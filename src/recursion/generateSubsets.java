package recursion;

public class GenerateSubsets {
    public static void generateSubsets(String s) {
        int n = s.length();
        int total = 1 << n; 

        for (int i = 0; i < total; i++) {
            String subset = "";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset += s.charAt(j);
                }
            }
            System.out.print(subset + " ");
        }
    }


    public static void main(String[] args) {
        generateSubsets("abc");
    }
}
