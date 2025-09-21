import java.util.*;

public class bitoperations {
    public static int getbit (int n , int i){
        int a =((n&(1<<i)));
        return a; 
    }
    public static int setbit(int n , int i){
        int a = ((n|(1<<i)));
        return a;
        
    }
    public static int clearbit(int n , int i){
        int a = ((n&(~(1<<i))));
        return a;
        
    }
    public static int updatebit(int n , int i , int newbit){
        // if(newbit==0){
        //     return clearbit(n,i);
        // }
        // else {
        //     return setbit(n,i);
        // }
        
        n = clearbit(n,i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static int clearibit(int n , int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static int clearrangeofbit(int n , int firstindex ,int lastindex){
        int bitmask1=((~0)<<lastindex+1);
        int bitmask2=((1<<firstindex)-1);
        int bitmask=bitmask1|bitmask2;
        return n & bitmask ;
    }
    public static boolean poweroftwo(int n){
        if( (n & (n-1)) != 0){
            return false;
        }
        return true;
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n & 1)!= 0){ //check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in );
        int n= sc.nextInt();
        //int i= sc.nextInt();
        //int firstindex= sc.nextInt();
        //int lastindex= sc.nextInt();
        //int newbit=sc.nextInt();
        // if(getbit(n,i)==0){
        //     System.out.println("0");
        // } 
        // else {
        //     System.out.println("1");
        // }
        //  System.out.println(setbit(n,i));
        //  System.out.println(clearbit(n,i));
        //  System.out.println(updatebit(n,i,newbit));
        //  System.out.println(clearibit(n,i));
         //System.out.println(clearrangeofbit(n,firstindex,lastindex));
         
        //  if(poweroftwo(n)==true){
        //  System.out.println("is is power of two");
        //  }
        //  else{
        //     System.out.println("is is not a power of two"); 
        //  }
         System.out.println(countsetbits(n));
         sc.close();
    }
}
