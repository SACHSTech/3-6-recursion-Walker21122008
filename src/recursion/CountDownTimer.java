package recursion;

public class CountDownTimer {
    public static void countDown(int n) {

        //base case
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}