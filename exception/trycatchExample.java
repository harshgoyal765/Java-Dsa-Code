import java.util.*;
public class trycatchExample{
  public static void main(String args[]){
    try{
    int arr[]={1,2,3};
    System.out.println(arr[3]);
  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println("error catch:"+e);
  }
  System.out.println("out of the block");
  }
}