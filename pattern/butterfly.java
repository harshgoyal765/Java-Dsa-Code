package pattern;
public class butterfly {

    public static void printhollow(int row){
        int m=row;
     for(int i=1 ; i<=m ; i++){
         for(int j=1 ; j<=i ; j++){
          System.out.print("*");
          }
          for(int j=1 ; j<=(2*m)-(2*i) ; j++){
            System.out.print(" ");
              }
          for(int j=1 ; j<=i ; j++){
              System.out.print("*");
               }
            System.out.println();
          
         }
    }
    public static void main(String args[]){
       printhollow(9);
    }
}
