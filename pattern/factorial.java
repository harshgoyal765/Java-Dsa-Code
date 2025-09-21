package pattern;
import java.util.*;

public class factorial {
    
    public static int fact(int n){
        int f=1;
        for(int i=1 ; i<=n ; i++){
         f=f*i;
        }
        System.out.println("factorial of n is : " + f );
        return f;
    }
    
    public static void main(String args[]){
      Scanner sc= new Scanner (System.in);
      int n=sc.nextInt();
      fact(n);
      sc.close();
    }
}
