import java.util.TreeMap;

public class treemap{
  public static void main(String args[]){
    TreeMap<String,Integer> tm= new TreeMap<>();
    //insert operation -O(1)
    tm.put("Australia",100);
    tm.put("china" , 130);
    tm.put("India",150);

    System.out.println(tm);

  }
} 