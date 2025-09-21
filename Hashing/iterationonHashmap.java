import java.util.*;

public class iterationonHashmap{
  public static void main(String args[]){
    HashMap<String,Integer> hm= new HashMap<>();
    hm.put("japan",56);
    hm.put("malasiya",98);
    hm.put("Australia",100);
    hm.put("china" , 130);
    hm.put("India",150);

    Set<String> keys=hm.keySet();
    System.out.println(keys);

    for(String k : keys){
      System.out.println("key = "+k+" , value="+hm.get(k));
    }
  }
} 