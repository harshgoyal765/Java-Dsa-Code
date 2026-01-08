public class subsetSum{
  public static boolean subset(int arr[],int tgsum){
    int v= arr.length;
    boolean dp[][]=new boolean [v+1][tgsum+1];
    for(int i=0 ;i<dp.length ;i++){
      dp[i][0]=true;
    }
    for(int j=1 ;j<dp[0].length ;j++){
      dp[0][j]=false;
    }
    for(int i=1;i<=v ;i++){
      for(int j=1 ;j<=tgsum ;j++){
          int val=arr[i-1];
          if(val<=j){
            if(dp[i-1][j-val]==true){
            dp[i][j]=true;
            }
            else if(dp[i-1][j]==true){
              dp[i][j]=true;
            }
          }
          else {
             dp[i][j]=false;
          }
            
          }
      }

    return dp[v][tgsum];
  }
  public static void main (String args[]){
    int arr[]={1,5,3,2,6,4};
    int tgsum=6;
    System.out.println("subset is present in array");
    System.out.println(subset(arr,tgsum));
  }
}