// package list;
import java.util.ArrayList;
public class Definearraylist {
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        //ArrayList<Integer> list1=new ArrayList<>();
        //ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        //get operation
        int value = list1.get(2);
        System.out.println(value);
        //delete operation
         list1.remove(2);
         System.out.println(list1);
         //set operation
         list1.set(1,10);
         System.out.println(list1);
         //contain operation
         System.out.println(list1.contains(11));
         //size of arraylist
         System.out.println(list1.size());
         //to print the arraylist
         for(int i=0 ; i<list1.size() ; i++){
            System.out.print(list1.get(i) + " ");
         }
         System.out.println();
    }
    
}
