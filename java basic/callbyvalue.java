import java.util.*;

public class callbyvalue {
    
    public static int swap(int a,int b){  //copy of a and b is input here
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is: "+ a +"  b is: " + b);
        return 0;
    }
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);//call by value
        sc.close();
    }
}
