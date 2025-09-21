import java.util.ArrayList;

public class PairSum2 {
    public static boolean FindPair(ArrayList<Integer> list1 ,int target){
        int bp=-1;
        for(int i=0 ; i<list1.size() ; i++){
            if(list1.get(i)>list1.get(i+1)){
                bp=i;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list1.get(lp)+list1.get(rp)==target){
                return true;
            }
            if(list1.get(lp)+list1.get(rp)<target){
                lp=(lp+1)%list1.size();
            }
            else{
                rp=((list1.size()+rp-1)%list1.size());
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
        FindPair(list1,target);
    }
}
