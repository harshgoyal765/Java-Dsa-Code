public class knapsack1{
  public static int recurKnapsack(int val[],int wt[],int W,int n){
    if(W==0 || n==0){
      return 0;
    }
    if(wt[n-1]<=W){   //valid
     //include 
     int ans1= val[n-1]+ recurKnapsack(val,wt,W-wt[n-1],n-1);
     //exclude
     int ans2 = recurKnapsack(val,wt,W,n-1);
     return Math.max(ans1,ans2);
    }
    else{
     return recurKnapsack(val,wt,W,n-1);
    }
  }
  //memoization method t.c O(n*W)
   public static int memoKnapsack(int val[],int wt[],int W,int n, int dp[][]){
    if(W==0 || n==0){
      return 0;
    }
    if(dp[n][W]!=-1){
      return dp[n][W];
    }
    if(wt[n-1]<=W){   //valid
     //include 
     int ans1= val[n-1]+ memoKnapsack(val,wt,W-wt[n-1],n-1,dp);
     //exclude
     int ans2 = memoKnapsack(val,wt,W,n-1,dp);
     dp[n][W] = Math.max(ans1,ans2);
     return dp[n][W];
    }
    else{
     dp[n][W] = memoKnapsack(val,wt,W,n-1,dp);
     return dp[n][W];
    }
  }
  public static void print(int dp[][]){
    for(int i=0 ;i<dp.length ;i++){
      for(int j=0 ;j<dp[0].length  ;j++){
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static int tabKnapsack(int val[],int wt[],int W){
    int n= val.length;
    int dp[][] = new int[n+1][W+1];
    for(int i=0 ;i<dp.length ;i++){
      dp[i][0]=0;
      }
    for(int j=0 ;j<dp[0].length ;j++){
      dp[0][j]=0;
    }
     for(int i=1 ;i<n+1 ;i++){
      for(int j=1 ;j<W+1 ;j++){
         int v=val[i-1];//ith value profit
         int w = wt[i-1];//ith weigth
         if(w<=j){
           int incProfit = v + dp[i-1][j-w];
           int excProfit = dp[i-1][j];
           dp[i][j]=Math.max(incProfit,excProfit);
         }
         else{
          dp[i][j]=dp[i-1][j];
         }
      }
    }
     print(dp);
     return dp[n][W];
  }
  public static void main(String args[]){
    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int w=7;
    System.out.println("maximum profit by 0/1 knapsack");
    System.out.println(recurKnapsack(val,wt,w,val.length));
    int dp[][]= new int[val.length+1][w+1];
    for(int i=0 ;i<dp.length ;i++){
      for(int j=0 ;j<dp[0].length ;j++){
        dp[i][j]=-1;
      }
    }
    System.out.println("maximum profit by 0/1 knapsack using memoization");
    System.out.println(memoKnapsack(val,wt,w,val.length,dp));
    System.out.println("maximum profit by 0/1 knapsack using tabulation");
    System.out.println(tabKnapsack(val,wt,w));
  }
}