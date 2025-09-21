public class movezeros {
    public static void movezero(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           for (int j=0 ; j<arr.length-1-i ; j++){
               if(arr[j]==0 && arr[j+1]!=0){
                  int temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
               }
           }     
        }
    }
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
         }
    }
    public static void main(String[] args) {
        int arr[]={0,67,0,43,7};//move zero in righthand side of the array but order of nonzero no.is remain same
        movezero(arr);
        printarr(arr);
    }
}

