package pattern;
public class printprime {
    public static int isprime(int n){
        for(int i=2 ; i<=(n-1); i++){
           if(n%i==0){
            return 0;
           }  
        }
        return 1;
       
    }
    public static void prprime(int n){
        for(int i=2 ; i<=n ; i++){
            if(isprime(i)==1){
                System.out.println(i +" ");
            }
        }
    }
    public static void main(String args[]){
        prprime(19);


    }
}
