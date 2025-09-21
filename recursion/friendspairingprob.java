package recursion;

public class friendspairingprob {
    public static int friendpairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //kaam
        //single
        int fnm1 = friendpairing(n-1);
        //pair
        int fnm2 = friendpairing(n-2);
        int pairways = (n-1)*fnm2;
        //total ways
        int total = fnm1 + pairways;
        return total;
         // for direct 
         //return friendpairing(n-1)+(n-1)*friendpairing(n-2)
    }
    public static void main (String args []){
        System.out.println(friendpairing(3));
    }
}
