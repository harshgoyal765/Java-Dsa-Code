public class arraangelexographical {
    public static void sortfruits(String[] fruits){
        int n=fruits.length;
        for(int i=0 ; i<n ; i++){
            int curridx=i;
            for(int j=i+1 ; j<n ; j++){
                if(fruits[j].compareTo(fruits[curridx])<0){
                    curridx=j;
                }
            }
            //swap
            String temp=fruits[curridx];
            fruits[curridx]=fruits[i];
            fruits[i]=temp;
        }
    }
    public static void main(String args[]){
        String[] fruits={"kiwi","apple","papaya","mango"};
        sortfruits(fruits);
        for(String val :fruits){
            System.out.print(val +" ");
        }
    }
}
