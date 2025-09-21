package pattern;
import java.util.*;
public class pattern1 {
    public static void main(String args[]){
    System.out.println("enter number of rows");
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    for(int i=1 ; i<=row ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print(" * ");
        }
        System.out.println();  
    }

    sc.close();

    }
}
