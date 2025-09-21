public class bubblesort {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
           for (int j=0 ; j<arr.length-1-i ; j++){
               if(arr[j]>arr[j+1]){
                  int temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
                  flag=true;//to improve time complexity in best case
                }
            } 
            if(!flag){
                return;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,67,8,43,7};
        bubble(arr);
        printarr(arr);
    }
}

