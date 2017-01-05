import java.util.HashSet;

/**
 * Created by benjihannam on 1/2/17.
 * Initially set up using a 2D integer array, will look into 1D set up after getting an initial set up
 */
public class Sudoku {

    public int[][] problem;


    public boolean isSolved(int[][] puzzle){

        //loop over every spot, if it is 0 then we have not covered the whole solution
        for(int x = 0; x < 9; x++){
            for(int y = 0; y < 9; y++){
                if(puzzle[x][y] == 0){
                    return false;
                }
            }

        }
        return true;
    }

    //check the current row we changed, row = y
    public boolean checkRow(int y){

        //a hashset to contain all the numbers already in the row
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int x = 0; x < 9; x++){

            //if the row contains a duplicate that is not 0s then return false
            if(nums.contains(problem[x][y]) && problem[x][y] != 0){
                return false;
            }
            else{
                nums.add(problem[x][y]);
            }
        }
        return true;
    }

    //check the current column, col = x
    public boolean checkColumn(int x){

        //a hashset to contain all the numbers already in the column
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int y = 0; y < 9; y++){

            //if the col contains a duplicate that is not 0s then return false
            if(nums.contains(problem[x][y]) && problem[x][y] != 0){
                return false;
            }
            else{
                nums.add(problem[x][y]);
            }
        }
        return true;
    }

    //check the current "box", box number = x/3 + (y/3 * 3), this uses integer division and the 2D set up
    public boolean checkBox(int row, int col){
        int box = col / 3 + row/3 * 3;

        //a hashset to contain all the numbers already in the box
        HashSet<Integer> nums = new HashSet<Integer>();

        //loop over all the spots in the box
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                //if the set already contains the number then return false

                //otherwise add the number in a continue
            }
        }
        return true;
    }


}
