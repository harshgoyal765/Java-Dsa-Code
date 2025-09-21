package pattern;
import java.util.*;
public class pattern7 {
    public static void pattern1(int size){
        for(int i=1 ; i<=size ; i++){
            for(int j=1 ; j<=size; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
     public static void pattern2(int size){
        for(int i=1 ; i<=size ; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int size){
        for(int i=1 ; i<=size ; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(j +" "); 
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your input size:");
        int size=sc.nextInt();
        pattern1(size);
        pattern2(size);
        pattern3(size);
        sc.close();
    }
}
