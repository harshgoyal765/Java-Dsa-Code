import java.util.*;
public class stairCase2
{
  //only 1 ,2 and 3 steps are allowed
    //recursion method
  public static int recurStair(int n){
    if(n<0){
      return 0;
    }
    if(n==0){
      return 1;
    }
   
    return recurStair(n-1)+recurStair(n-2)+recurStair(n-3);
  }
  //memoization method
  public static int memoizationStair(int n,int ways[]){
    if(n<0){
      return 0;
    }
    if(n==0){
      return 1;
    }
    if(ways[n]!=-1){
      return ways[n];
    }
    ways[n]=memoizationStair(n-1,ways)+memoizationStair(n-2,ways)+memoizationStair(n-3,ways);
    return ways[n];
  }
  //tabular method
  public static int tabulationfib(int n){
   int dp [] = new int [n+1];
   dp[0]=1;
   dp[1]=1;
   
   for(int i=2 ;i<=n ;i++){
    if(i==2){
       dp[i]= dp[i-1]+dp[i-2];
    }
    else{
    dp[i]= dp[i-1]+dp[i-2]+dp[n-3];
    }
   }
   return dp[n];//ans
  }
  public static void main(String args[]){
     System.out.print ("enter the number of floor:  ");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int ways[] = new int [n+1];
     Arrays.fill(ways,-1);
     System.out.println("Staircase count ways using recursion:");
     System.out.println(recurStair(n));
     System.out.println("Staircase count ways using memoization:");
     System.out.println(memoizationStair(n, ways));
     System.out.println("Staircase count using tabulation:");
     System .out.println(tabulationfib(n));
  }

}