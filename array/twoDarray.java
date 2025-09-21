import java.util.*;
public class twoDarray {
    public static boolean search(int matrix[][] ,int key){
       for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if( matrix[i][j] == key){
                    System.out.print("("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int [4][3];
        //input elements in matrix
        Scanner sc= new Scanner (System.in);
        int m=matrix.length; int n=matrix[0].length;
        for(int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ; j++){
                matrix[i][j]=sc.nextInt();
            }
        } 
        //output the elements
        for(int i=0; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }
        search( matrix, 5);
        sc.close();
    }
}
