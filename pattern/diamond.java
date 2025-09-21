package pattern;

import java.util.*;
public class diamond {
    public static void diamond1(int size){
        if(size%2==0){
            System.out.println("enter a odd number");
        }
        int mid = size/2; 

        // Upper part
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i )+ 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter yor input size : ");
        int size=sc.nextInt();
        diamond1(size);
        sc.close();
    }
}








