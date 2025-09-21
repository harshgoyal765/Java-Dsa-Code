public class subarray {
//     public static void subarr(int numbers[]){
//         int ts=0;
//         for(int i=0 ; i<numbers.length ; i++){
//             int start=i;
//             for(int j=i; j<numbers.length ; j++){
//                 int end = j;
//                 for(int k=start ; k<=end ; k++){
//                     System.out.print(numbers[k]+" ");//print subarray
//                 }
//                 ts++;
//                 System.out.println();
//             }
//            System.out.println();
//         }
//         System.out.println("total subarray is :" + ts);
//     }
//     public static void main(String args[]){
//        int numbers[] = {1,2,3,4,5,6};
//        subarr(numbers);
//     }
// }
// //max sum in sub array
// public class subarray {
//     public static void maxsubarrsum(int numbers[]){
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0 ; i<numbers.length ; i++){
//             int start=i;
//             for(int j=i; j<numbers.length ; j++){
//                 int end = j;
//                 currsum = 0;
//                 for(int k=start ; k<=end ; k++){
//                    currsum+=numbers[k];
                   
//                 }
//                 System.out.println(currsum);
            
//               if(maxsum<currsum){
//              maxsum=currsum;
//               }
                
//             }
            
//         }
//         System.out.println("maximum subarray sum is :" + maxsum);
//     }

//     public static void main(String args[]){
//        int numbers[] = {1};
//        maxsubarrsum(numbers);
//     }
//}//time complexity is O(n^3) which is bad



// //max subarray sum by prefix method
// public class subarray {
//     public static void maxsubarrsum(int numbers[]){
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
//         int prefix[]=new int[numbers.length];
//         prefix[0]=numbers[0];
//         //calculate prefix array
//         for(int i=1 ; i<numbers.length ; i++){
//             prefix[i]=prefix[i-1]+numbers[i];
//         }
//         for(int i=0 ; i<numbers.length ; i++){
//             int start=i;
//             for(int j=i; j<numbers.length ; j++){
//                 int end = j;
//                 currsum =  start==0 ? prefix[end] : prefix[end]-prefix[start-1];
              
//               if(maxsum<currsum){
//              maxsum=currsum;
//               }
                
//             }
            
//         }
//         System.out.println("maximum subarray sum is :" + maxsum);
//     }//time complexity is O(n^2) < O(n^3) so it is a optimised solution
//     public static void main(String args[]){
//                int numbers[] = {1,2,3};
//                maxsubarrsum(numbers);
//             }
//          }
// //     //kadanes algorithm function
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0 ; i<numbers.length ; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is :" + ms);
    }
    public static void main(String args[]){
       int numbers[] = {1,2,3};
       kadanes(numbers);
    }
}
//time complexity is O(n) < O(n^3) so it is a optimised solution