import java.util.Scanner;

/**
 * Created by benjihannam on 12/28/16.
 */
public class FactorialDrive {

    public static void main(String[] args){
        while(true){
            System.out.println("Please enter a number greater than or equal to 0 or a number < 0 to quit:");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if(n < 0){
                break;
            }
            Factorial run = new Factorial(n);

            run.solve();
        }
    }
}
