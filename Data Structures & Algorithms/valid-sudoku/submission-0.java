class Solution {
    public boolean isValidSudoku(char[][] board) {
     
       for(int row=0;row<9;row++){
        for(int col=0;col<9;col++){
            if(board[row][col] =='.'){
                continue;
            }
             int startrow =(row/3)*3;
      int startcol = (col/3)*3;
            //row
           for(int i=0;i<9;i++){
            if(row==i){continue;}
             if(board[row][col]==board[i][col]){
                return false;
             }
           }
           //col
           for(int j=0;j<9;j++){
            if(col==j){continue;}
            if(board[row][col]==board[row][j]){
                return false;
            }
           }
           //3X3
           for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(startrow+i==row && startcol+j==col) continue;
                if(board[row][col]==board[startrow+i][startcol+j]){return false;}
            }
           }

        }
       }
       return true;
    }
}
