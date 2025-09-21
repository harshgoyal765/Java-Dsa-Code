import java.util.HashMap;

public class createHashmap{
  public static void main(String args[]){
    HashMap<String,Integer> hm= new HashMap<>();
    //insert operation -O(1)
    hm.put("Australia",100);
    hm.put("china" , 130);
    hm.put("India",150);

    System.out.println(hm);

    //get operation-O(1)
    System.out.println(hm.get("India"));

    //containsKey operation-O(1)
    System.out.println(hm.containsKey("India"));

    //remove operation-O(1)
     System.out.println(hm.remove("India"));

     //size
     System.out.println(hm.size());

     //IsEmpty
     System.out.println(hm.isEmpty());

     //clear-it clear the complete map
     System.out.println(hm.clear());

  }
} 