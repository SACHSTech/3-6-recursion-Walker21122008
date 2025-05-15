package recursion;

public class DecimalToBinary {
    public static String toBinary(int n) {

        //base cases
        if (n == 0){
            return "0"; 
        } 
        
        if (n == 1){
            return "1"; 
        }

        //recursion case
        return toBinary(n / 2) + (n % 2); 
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10)); 
    }
}


