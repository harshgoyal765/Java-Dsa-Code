public class spiralmatrix {
 public static void spiral(int matrix[][]){
    int st_row=0;
    int st_col=0;
    int end_col=matrix[0].length-1;
    int end_row=matrix.length-1;
    while(st_row<=end_row && st_col<=end_col){
        //for top row
        for(int j=st_col ; j<=end_col ; j++ ){
            System.out.print(matrix[st_row][j]+" ");
        }
        
        //for right column
        for(int i=st_row+1; i<=end_row ; i++){
           
            System.out.print(matrix[i][end_col]+" ");
        }
        
        //for bottom row
        for(int j=end_col-1; j>=st_col ; j-- ){
            if(st_row==end_row){
                break;
            }
            System.out.print(matrix[end_row][j]+" ");
        }
        
        //for left coloumn
        for(int i=end_row-1 ; i>=st_row+1 ; i--){
            if(st_col==end_col){
                break;
            }
            System.out.print(matrix[i][st_col] +" ");
        }
        st_row++;
        st_col++;
        end_col--;
        end_row--;
   
    }
    System.out.println();
 }    

//  public static void main(String args[]){
//     int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//     spiral(matrix);
//  }
// }
// public class spiralmatrix {
//  public static void spiral(int matrix[][]){
//     int st_row=0;
//     int st_col=0;
//     int end_col=matrix[0].length-1;
//     int end_row=matrix.length-1;
//     while(st_row<=end_row && st_col<=end_col){
//         //for top row
//         for(int j=st_col ; j<=end_col ; j++ ){
//             System.out.print(matrix[st_row][j]+" ");
//         }
//         st_row++;
//         //for right column
//         for(int i=st_row; i<=end_row ; i++){
           
//             System.out.print(matrix[i][end_col]+" ");
//         }
//         end_col--;
//         //for bottom row
//         if(st_row<=end_row){
//            for(int j=end_col; j>=st_col ; j-- ){
//             System.out.print(matrix[end_row][j]+" ");
//            }
//         } 
//         end_row--;
//         //for left coloumn
//         if(st_col<=end_col){
//            for(int i=end_row ; i>=st_row ; i--){
//               System.out.print(matrix[i][st_col] +" ");
//             }
//         }
//             st_col++;
   
//     }
//     System.out.println();
//  }    

 public static void main(String args[]){
    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //int matrix1[][]={{1,2,3}
                   //,{4,5,6}
                   //,{7,8,9}};
               
    spiral(matrix);
 
   }
}