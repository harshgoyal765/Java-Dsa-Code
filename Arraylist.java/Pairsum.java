import java.util.ArrayList;

public class Pairsum {
    public static boolean FindPair(ArrayList<Integer> list1 , int target){
        for(int i=0 ; i<list1.size() ; i++){
            for(int j=i+1 ; j<list1.size() ; j++){
                if(list1.get(i)+list1.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
           ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        int target=3;
        System.out.println(FindPair(list1,target));
    }
}
