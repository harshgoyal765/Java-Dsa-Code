package pattern;
import java.util.*;
public class pattern6 {
    public static void hollowsquare(int size){
        for(int i=1 ; i<=size ; i++){
            for(int j=1 ; j<=size ; j++){
                if(i==1 || j==1 || i==size || j==size ){
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
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your input size :");
        int size=sc.nextInt();
        hollowsquare(size);
        sc.close();
    }
}


