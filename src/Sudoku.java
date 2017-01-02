/**
 * Created by benjihannam on 1/2/17.
 */
public class Sudoku {

    public int[] problem;


    public boolean isSolved(int[][] puzzle){

        //loop over every spot, if it is 0 then we have not covered the whole solution
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(puzzle[i][j] == 0){
                    return false;
                }
            }

        }
        return true;
    }

    //check the current row we changed, row = i % 9
    public boolean checkRow(int row){
        return true;
    }

    //check the current column, col = i
    public boolean checkColumn(int col){
        return true;

    }

    //check the current "box", box =
    public boolean checkBox(int box){
        return true;

    }


}
