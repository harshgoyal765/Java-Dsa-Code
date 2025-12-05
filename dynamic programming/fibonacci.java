import java.util.*;
public class fibonacci{
  //memoization method
  public static int memoizationfib(int n,int f[]){
    if(n==0 || n==1){
      return n;
    }
    if(f[n]!=0){
      return f[n];
    }
    f[n]=memoizationfib(n-1,f)+memoizationfib(n-2,f);
    return f[n];
  }
  //tabular method
  public static int tabulationfib(int n){
   int dp [] = new int [n+1];
   dp[0]=0;
   dp[1]=1;
   for(int i=2 ;i<=n ;i++){
    dp[i]= dp[i-1]+dp[i-2];
   }
   return dp[n];//ans
  }
  public static void main(String args[]){
     System.out.print ("enter the number of terms:  ");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int f[] = new int [n+1];
     System.out.println("Fibonacci using memoization:");
     System.out.println(memoizationfib(n, f));
     System.out.println("Fibonacci using tabulation:");
     System .out.println(tabulationfib(n));
  }

}