import java.util.*;
public class checkoddeven{
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in );
        int n= sc.nextInt(); 
        int bit=1;
          if( (n & bit) == 0){
            System.out.print("it is a even number");
          }
          else{
            System.out.print("it is a odd number");
          }
          sc.close();
    }
}