package pattern;
import java.util.*;
public class pattern5 {

    public static void pattern(int size){
        int mid=size/2;
        //for upper half
        for(int i=1 ; i<=mid ; i++){

            for(int j=1 ;j<=mid-(i-1) ; j++){
              System.out.print("*");
            }
            for(int j=1 ; j<2*i-1 ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=mid-(i-1) ; j++){
                System.out.print("*");
            }
          System.out.println();
        }
       // for lower half
        for(int i=mid+1 ; i<=size ; i++){
          for(int j=1 ;j<=i-mid ; j++){
            System.out.print("*");
          }
          for(int j=2 ; j<=2*size-(2*i-1); j++){
              System.out.print(" ");
          }
          for(int j=1 ; j<=i-mid ; j++){
              System.out.print("*");
          }
        System.out.println();
      }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your input size :");
        int size=sc.nextInt();
       pattern(size);
        sc.close();
    }
}
