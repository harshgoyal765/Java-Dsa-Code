import java.util.*;
public class finallyblock{
  public static void main(String args[]){
    try{
    int arr[]={1,2,3};
    System.out.println(arr[3]);
  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println("error catch:"+e);
  }
  finally{
    System.out.println("In the Finally Block");
  }
  System.out.println("out of the block");
  }
}