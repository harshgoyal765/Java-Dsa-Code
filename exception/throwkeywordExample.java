import java.util.*;
public class throwkeywordExample{
   void testage(int age ){
    if(age<18){
      throw new ArithmeticException("not valid");
    }
    else{
      System.out.println("valid for vote");
    }

   }
  public static void main(String args[]){
   throwkeywordExample obj = new throwkeywordExample();
    try{
      obj.testage(17);
  }
  catch(ArithmeticException e){
    System.out.println("error catch:"+e);
  }
  System.out.println("out of the block");
  }
}