import java.util.ArrayList;

public class MaxinArrList {
     public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        int max=list1.get(0);
        for(int i=0 ; i<list1.size() ; i++ ){
            if(list1.get(i)>max){
               max=list1.get(i);
            }
           
        }
        System.out.println("Maximum of arraylist is : " + max);
     }
}
