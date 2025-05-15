package recursion;

public class SumDigits {
    public static int sumOfDigits(int n){
        //base case
        if (n == 0) {
            return 0;
        }

        //recursive case
        return n % 10 + sumOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(sumOfDigits(34));
    }
}
