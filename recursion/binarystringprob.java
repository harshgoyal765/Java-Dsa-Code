package recursion;

public class binarystringprob {
    public static void printbinstring(int n , int lastplace , String str){
        if (n== 0){
            System.out.print(str);
        }
        //kaam
        printbinstring(n-1 , 0 , str.append("0"));
        if(lastplace == 1){
            printbinstring(n-1 , 1 , str.append("1"));
        }  
    }
    public static void main(String args []){
        printbinstring(3 , 0 , new StringBuilder(""));
    }
}
