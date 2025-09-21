import java.util.*;
public class hcf {
    public static int hcfnum(int a, int b){
        int hcf=1;
        int small=(a<b)?a:b;
        for(int i=small ; i>=1 ; i--){
            if(a % i==0 && b % i==0){
                hcf=i;
                break;
            }
        }
        return hcf;
    }
    public static void main(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("HCF of"+a+ " and " + b + "is" + hcfnum(a,b));
        sc.close();
    }
}
