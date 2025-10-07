class Main {
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
      int orig=145;
      int num=orig;
      int rem=0 ; int sum=0;
      while(num>0){
          rem=num%10;
          sum+=fact(rem);
          num/=10;
      }
      if(sum==orig){
          System.out.println("Strong number");
      }
      else{
          System.out.println("not a strong number");
      }
    }
}
