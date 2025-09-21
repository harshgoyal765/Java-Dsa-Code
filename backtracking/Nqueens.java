package backtracking;
public class Nqueens {
    public static boolean isSafe(char board[][] , int row , int col){
      //vertical up
      for(int i=row-1 ; i>=0 ; i--){
          if(board[i][col] == 'Q'){
             return false; 
           }
      }
      //diag left up
      for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i-- , j--){
           if(board[i][j]== 'Q'){
              return false;
            }
      }

      //diag rightup
      for(int i=row-1 , j=col+1 ; i>=0 && j<board.length ; i-- , j++){
           if(board[i][j]== 'Q'){
               return false;
            }
      }
      return true;
    }
    public static void nqueensarr(char board[][] , int row){
        
        //base
        if(row==board.length){
         //to count total possible solution 
         count++;
         printboard(board);
         return;
        }
        
        
        //column
        for(int j=0 ; j<board.length ; j++){
            if(isSafe(board, row , j)){
            board[row][j]='Q';
            nqueensarr(board , row+1);//function call
            board[row][j]='x';//backtracking step
            }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("------chess board --------");
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                board[i][j]='x';
            }
        }
        nqueensarr(board , 0);
        System.out.println("total no. of ways is :"+count);
    }
}
