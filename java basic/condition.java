import java.util.*;

public class condition {
      public static void main(String args[]){
      System.out.println("give your age");
      Scanner sc = new Scanner(System.in);
      int age=sc.nextInt();
      if(age>=18){
       System.out.println("you are eligiblie to vote");
      }
      else{
      System.out.println("you are not eligible to vote");

      }
      sc.close(); 
    }   
}
