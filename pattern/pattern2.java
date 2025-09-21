package pattern;
import java.util.*;
public class pattern2 {
    public static void main(String args[]){
    System.out.println("enter number of rows");
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    for(int i=1 ; i<=row ; i++){
        for(int j=1 ; j<=(4-(i-1)) ; j++){
            System.out.print(" * ");
        }
        System.out.println();  
    }

    sc.close();

    }

 
    
}
