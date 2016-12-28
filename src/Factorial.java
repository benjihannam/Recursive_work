/**
 * Created by benjihannam on 12/28/16.
 */
public class Factorial {
    int n;

    public Factorial(int number){
        n = number;
    }

    public void solve(){
        System.out.println(n + "! is: " + multiply(n));
    }
    public int multiply(int num){
        if(num == 0){
            return 1;
        }
        return num * multiply(num - 1);

    }
}
