package recursion;

public class SumDigits {
    public static int sumOfDigits(int n){
        if (n == 0) {
            return 0;
        }
        int quotient = n % 10;
        return quotient + sumOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(sumOfDigits(34));
    }
}
