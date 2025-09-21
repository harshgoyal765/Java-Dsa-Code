import java.util.*;

public class unionandintersection{
  public static void main(String args[]){
    int arr1[]={7,3,9};
    int arr2[]={6,3,9,2,9,4};
    HashSet<Integer> hs = new HashSet<>();

    for(int i=0 ; i<arr1.length ; i++){
       hs.add(arr1[i]);
    }
     for(int i=0 ; i<arr2.length ; i++){
       hs.add(arr2[i]);
    }
    System.out.println("union of two arrays is "+ hs.size());
  
  //intersection
  hs.clear();
  for(int i=0 ;i<arr1.length ;i++){
       hs.add(arr1[i]);
    }

    int count=0;
    for(int i=0 ;i<arr2.length ;i++){
      if(hs.contains(arr2[i])){
        count++;
        hs.remove(arr2[i]);
      }

      }
      System.out.println("intersection of two arrays is "+ count);
    }
}