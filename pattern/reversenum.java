package pattern;
import java.util.*;
public class reversenum {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int num=sc.nextInt();
     int reverse=0;
     while(num>0){
         int lastdigit=num%10;
         reverse=reverse*10+lastdigit;
         num/=10;
     }
     System.out.println(reverse);

     sc.close();
    }
}
