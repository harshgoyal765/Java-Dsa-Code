package pattern;
import java.util.*;
public class incometaxcalculator {
    public static void main(String args[]){
       System.out.println("enter your income");    
        Scanner sc = new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if (income <= 500000){
            tax=0;
            System.out.println(tax);
        }
        else if (income>500000 && income<=1000000){
            tax=(int)((income*20)/100);
            System.out.println(tax);
        }
        else   {
            tax=(int)((income*30)/100);
            System.out.println(tax);
        } 
        sc.close();




    }
}
