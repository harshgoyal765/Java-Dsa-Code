package pattern;
public class hollowrectangle {
    public static void printhollow(int row,int coloumn){
        int m=row;
        int n= coloumn;
        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=n ; j++){
                if (i==1 || i==m || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
       printhollow(5,4);
    }
}
