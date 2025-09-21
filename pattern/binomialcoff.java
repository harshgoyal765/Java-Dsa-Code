package pattern;
import java.util.*;
public class binomialcoff {
    public static int fact(int n){
        int f=1;
        for(int i=1 ; i<=n ; i++){
         f=f*i;
        }
    
        return f;
    }
    public static int bincoff(int n, int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nmr_fact=fact(n-r);
        int bc=n_fact/(r_fact*nmr_fact);
        System.out.println( "binomial cofficient of "+n+"C"+r+" is : " +bc);
        return bc;
    } 
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r = sc.nextInt();
        bincoff(n,r);
        sc.close();

    } 
}
