public class insertionsort {
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Insertion(int arr[]){
        for (int i=1 ; i<arr.length ; i++){
           int j=i;
           while(j>0 && arr[j]<arr[j-1]){
            //swap
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
           }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,67,8,43,7};
        Insertion(arr);
        printarr(arr);
    }
}
