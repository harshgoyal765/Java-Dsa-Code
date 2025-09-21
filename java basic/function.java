import java.util.*;
public class function {
    public static void printhello(){
        System.out.println("hello");
    }
    public static int printsum(int a,int b){  //here a and b are perameters or formal parameters
        int sum=a+b;
        System.out.println("sum is:" + sum);
        return 0;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        printhello();
        printhello();
        printsum(a,b);//here 5 and 4 are arguments or actual parameters
        sc.close();
    } 
}
