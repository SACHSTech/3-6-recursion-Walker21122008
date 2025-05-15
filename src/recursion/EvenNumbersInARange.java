package recursion;

public class EvenNumbersInARange {
    public static void evenNumbers(int start, int end) {

        //base case
        if(start > end){
            return;
        }
        if(start % 2 == 0){
            System.out.print(start + " ");
        }

        //recursion case
        evenNumbers(start + 1, end);
    }

    public static void main(String[] args) {
        evenNumbers(10, 12);
    }
}

