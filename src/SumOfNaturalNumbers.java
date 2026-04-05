
import java.util.Scanner;

/**
 * According to Module 1, we use classes and methods to define logic.
 * This class encapsulates the sum calculation.
 */
public class SumOfNaturalNumbers {

    /**
     * NumberSum() takes an integer N and returns the sum.
     * This uses the iterative approach suitable for a beginner level.
     */
    public int NumberSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner is used for standard input as per common Java practice [cite: 100]
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            
            // Creating an object to access the NumberSum method 
            NaturalSum obj = new NaturalSum();
            int total = obj.NumberSum(N);
            
            // Output format: Print the sum [cite: 51]
            System.out.println(total);
        }
        sc.close();
    }
}
