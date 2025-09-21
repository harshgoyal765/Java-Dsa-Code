package pattern;
import java.util.*;
public class binarytodecimal {
    public static int bintodec(int binnum){
        int mynum=binnum;
        int pow=0;
        int dec=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum/=10;
            
        }
        System.out.println("the decimal number of "+ mynum +" is : "+dec);
        return dec;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        bintodec(a);
        sc.close();
    }
}
