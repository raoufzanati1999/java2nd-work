
import java.util.Scanner;
public class FibonacciSequence {

    public static void main(String[] args) {

        System.out.println("Enter the index of Fibonacci Sequence");

        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        if(n>1){
            for(int i = 0; i < n; i++){

                sum = num1 + num2;

                num1 = num2;
                num2 = sum;

            }
        }

        System.out.println("\nThe fn of " + n + " is " + num1);

    }
}
