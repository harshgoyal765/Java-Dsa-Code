import java.util.ArrayList;

public class Swapnum {
       public static void swap(ArrayList<Integer> list1 , int idx1 , int idx2){
              int temp=list1.get(idx1);
              list1.set(idx1,list1.get(idx2));
              list1.set(idx2 , temp);
             
       }
       public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        swap(list1 , 1 , 3);
        System.out.println(list1);
       }
}
