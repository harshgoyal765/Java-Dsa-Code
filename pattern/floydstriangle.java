package pattern;
public class floydstriangle {
    public static void printhollow(int row,int coloumn){
        int m=row;
        
        int counter=1;
        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=i ; j++){
            System.out.print(counter+" ");
            counter++;
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
       printhollow(5,4);
    }
}
