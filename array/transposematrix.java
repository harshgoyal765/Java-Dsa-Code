public class transposematrix {
    public static void transpose(int matrixa[][],int matrixb[][] ){
        for(int i=0 ; i<matrixa.length ; i++){
            for(int j=0 ; j<matrixa[0].length ; j++){
               
               matrixb[j][i]=matrixa[i][j];
               
            }
        }
    }
    
    public static void main(String args [] ){
        int matrixa[][]={{1,2,3},{4,5,6}};
        int matrixb[][]=new int[3][3];
        transpose(matrixa,matrixb);
        for(int i=0 ; i<matrixb.length ; i++){
            for(int j=0 ; j<matrixb[0].length-1 ; j++){
                System.out.print(matrixb[i][j] +" ");
             }
           System.out.println();
         }
    }
}
