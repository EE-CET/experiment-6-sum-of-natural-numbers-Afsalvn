import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Task: The NumberSum function as a method of the Main class
    public int NumberSum(int N) {
        // Using the mathematical formula for efficiency: (N * (N + 1)) / 2
        return N * (N + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading N from the first line
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            
            // Instantiate the class to call the instance method
            Main solver = new Main();
            int result = solver.NumberSum(N);
            
            // Printing the output
            System.out.println(result);
        }
        
        sc.close();
    }
}
