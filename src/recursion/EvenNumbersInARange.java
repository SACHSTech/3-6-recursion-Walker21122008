package recursion;

public class EvenNumbersInARange {
    public static void evenNumbers(int start, int end) {
        if (start <= end) { 
            if (start % 2 == 0) {
                System.out.print(start + " ");
            }
            evenNumbers(start + 1, end); 
        }
    }

    public static void main(String[] args) {
        evenNumbers(10, 12);
    }
}

