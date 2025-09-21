
import java.util.*;
public class countvowel {
    public static int countvowels(String arr){
        int count=0;
      for(int i=0 ; i<arr.length() ; i++){
        if(arr.charAt(i)=='a' || arr.charAt(i)=='e' || arr.charAt(i)=='i' || arr.charAt(i)=='o' || arr.charAt(i)=='u' ){
            count++;
        }
      }
      return count;
    }
    public static void main(String args[]){
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String arr =sc.nextLine();
       
        System.out.println("total number of vowels is :"+ countvowels(arr));
       
        sc.close();
    }
}
