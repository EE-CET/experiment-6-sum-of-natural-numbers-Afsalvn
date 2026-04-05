import java.util.Scanner;

// The public class name MUST exactly match the filename
public class SumOfNaturalNumbers {

    public int NumberSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            
            // FIX: Use the correct class name to create the object
            SumOfNaturalNumbers obj = new SumOfNaturalNumbers();
            int total = obj.NumberSum(N);
            
            System.out.println(total);
        }
        sc.close();
    }
}
