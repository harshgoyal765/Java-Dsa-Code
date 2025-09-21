import java.util.ArrayList;

public class ContainerWater {
    //brute force approach
    public static int MostWater(ArrayList<Integer> list1){
        int maxwater=0;
        for(int i=0 ; i<list1.size() ; i++){
            for(int j=i+1 ; j<list1.size() ; j++){
            int height=Math.min(list1.get(i) , list1.get(j));
            int width= j-i;
            int currwater=width * height;
            maxwater=Math.max(currwater , maxwater);
            }
            System.out.println();
        }
        return maxwater;
    }
    //two pointer approach
    public static int MaxWater(ArrayList<Integer> list1){
        int lp=0;int maxwater=0;
        int rp=list1.size()-1;
        while(lp<rp){
            int height=Math.min(list1.get(lp),list1.get(rp));
            int width=rp-lp;
            int currwater=height*width;
            maxwater=Math.max(maxwater,currwater);
            if(list1.get(lp)<list1.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(8);
        list1.add(6);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add(3);
        list1.add(7);
        System.out.println(MostWater(list1));
        System.out.print(MaxWater(list1));
    }
}
