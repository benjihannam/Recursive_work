/**
 * Created by benjihannam on 12/18/16.
 * A simple program to print the first n fibonacci numbers, E.g n = 1: 1; n = 2: 1,1; n = 3: 1,1,2
 */
public class Fibonacci {
    int max_depth;
    long first;
    long second;

    public Fibonacci(){
        first = 1;
        second = 1;
    }

    //does the base cases of 0,1 and 2
    public void get_solution(int n){
        max_depth = n;
        //handle n = 0
        if(max_depth <= 0){
            System.out.printf("Error: %d was entered. \n", max_depth);
        }
        //handle n = 1
        else if(max_depth == 1){
            System.out.println("The first fibonacci number is 1.");
        }
        //handle n = 2
        else if(max_depth == 2){
            System.out.println("The first 2 fibonacci numbers are 1, 1.");
        }
        //all others
        else{
            String init = "1, 1";
            String answer = get_sequence(max_depth - 2, init);
            System.out.printf("The first %d fibonacci numbers are %s", max_depth, answer);
        }
    }

    //recursively get each number and add it to the string
    public String get_sequence(int current_depth, String answer){
        //if not at base case
        if(current_depth > 0){

            //get the number
            long next_number = first + second;
            first = second;
            second = next_number;

            //add it to the string
            answer += ", ";
            //10 numbers to a line
            if((max_depth - current_depth) % 10 == 0){
                answer += "\n                                   ";
            }
            answer += next_number;

            //return the new string
            return get_sequence(current_depth - 1, answer);
        }

        //base case returns the final string
        return answer + ".";
    }
}

