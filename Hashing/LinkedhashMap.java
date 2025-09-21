import java.util.LinkedHashMap;

public class LinkedhashMap{
  public static void main(String args[]){
    LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
    //insert operation -O(1)
    lhm.put("Australia",100);
    lhm.put("China" , 130);
    lhm.put("India",150);

    System.out.println(lhm);

  }
} 