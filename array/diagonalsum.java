public class diagonalsum {
    public static int diagsum(int matrix [][]){
       int sum=0;
        for(int i=0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
         
        }
        return sum;1
    }

//but time complexity of this code O(n^2) and is not good
    public static int dgsum(int matrix[][]){
        int sum=0;
        for (int i=0 ; i<matrix.length ; i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=(matrix.length-1)-i){
            sum +=matrix[i][(matrix.length-1)-i];
            }
        }
        return sum;
    }

 //time complexity is O(n);
    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagsum(matrix));
        System.out.print(dgsum(matrix));
    }
}
