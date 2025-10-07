class third {
   public static void leftrotate(int arr[],int d){
       int n=arr.length;
       d=d%n;
       int temp[]= new int [d];
       for (int i=0 ;i<d ;i++){
           temp[i]=arr[i];
       }
       for(int i=d ;i<arr.length ;i++){
           arr[i-d]=arr[i];
       }
       for(int i=0 ;i<d ;i++){
           arr[n-d+i]=temp[i];
       }
       for(int i=0 ;i<n ;i++){
           System.out.println(arr[i]);
       }
   }
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5};
     int d=3;
     leftrotate(arr,d);
    } 
}

