public class binearysearch_2 {
    
    public static int binsearch(int numbers[] ,int key){
        int start=0;  int end=numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparison
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;//right part
            }
            else{
                end=mid-1;//left part
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
       int numbers[]={ 1,2,3,4,5,6};
       System.out.println("index for key is : " + binsearch(numbers,5));
    }
}

