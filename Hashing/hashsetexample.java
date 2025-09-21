import java.util.*;

public class hashsetexample{
  public static void main(String args[]){
    HashSet<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(4);
    set.add(2);//we want to add 2 times but hashset is unique so it can not add same value multiple times
    set.add(1);

    System.out.println(set);
    if(set.contains(2)){
      System.out.println("set contains 2");
    }
     if(set.contains(3)){
      System.out.println("set contains 3");
    }

  }
}