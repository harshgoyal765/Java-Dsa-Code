class Main {
    public static void main(String[] args) {
        int n= 28;int sum=0;
        int half=n/2;
        for (int i=1 ;i<=half ;i++){
            if(n%i == 0 ){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("it is not a perfect number");
        }
    }
}
