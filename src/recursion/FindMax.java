package recursion;

public class FindMax {
    public static int findMax(int[] arr, int n){

        //base case
        if(n == 1){
            return arr[n-1];
        }
        
        //recursive case
        int max = findMax(arr, n-1);

        if (max > arr[n-1]){
            return max;
        }
        else{
            return arr[n-1];
        }
         
    }
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 2, 3, 4},4));
    }


}
