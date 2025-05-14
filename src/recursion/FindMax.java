package recursion;

public class FindMax {
    public static int findMax(int[] arr, int n){
        System.out.println("DEBUG 1: n=" + n);
        if(n == 1){
            return arr[n-1];
        }

        
        int max = findMax(arr, n-1);
        System.out.println("DEBUG: n=" + n +", max=" + max);

        if (max > arr[n-1]) return max;
        else return arr[n-1];
         
    }
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 2, 3, 4},4));
    }


}
