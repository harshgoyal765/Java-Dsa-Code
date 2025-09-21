package pattern;
import java.util.*;
public class decimaltobinary {

    public static int dectobin(int decnum){
        int mynum=decnum;
        int pow=0;
        int bin=0;
        while(decnum>0){
            int lastdigit=decnum%2;
            bin=bin+(lastdigit*(int)Math.pow(10,pow));
            pow++;
            decnum/=2;;
            
        }
        System.out.println("the decimal number of "+ mynum +" is : "+bin);
        return bin;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        dectobin(a);
        sc.close();
    }
}
