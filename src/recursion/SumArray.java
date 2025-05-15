package recursion;

public class SumArray {
    public static int sumArray(int[] arr, int n){

        //base case
        if (n == 0){
            return 0;
        } 

        //recursive case
        return arr[n - 1] + sumArray(arr, n - 1);
        
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1, 2, 3, 4}, 3));
    }
}
