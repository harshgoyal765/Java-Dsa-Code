package recursion;

public class recursion {
    public static void printdec(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
       System.out.println(n);
       printdec(n-1);
        
    }
    public static void printinc(int n){
           if(n==1){
            System.out.print(1 + " ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" "); 
    }
    public static int printfact (int n){
        if(n==0){
            return 1;
        }
        //int fnm1=printfact(n-1);
        int fact = n * printfact(n-1);
        return fact;
        
    }
    public static int firstNnatural(int n){
        if(n==1){
           
            return 1;
        }
        int a=firstNnatural(n-1);
        int sum = a + n;
        return sum;
    }
    public static int fibnumber(int n){
        if(n==0 || n==1){
           return n ;
        }
        return (fibnumber(n-1)+fibnumber(n-2));
       
    }
    public static boolean checksortedarray(int arr[] , int i){
        if (i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
          return checksortedarray(arr,i+1); 
    }
    public static int firstoccurance(int arr2[],int key , int i){
        if(i==arr2.length ){
            return -1;
        }
        if(arr2[i]==key){
            return i;
        }
        return firstoccurance(arr2,key,i+1);
    }
    public static int lastoccurance(int arr2[],int key , int i){
      
      if(i==arr2.length-1){
        return -1;
      }
      int isfound=lastoccurance(arr2,key,i+1);
      if(isfound == -1 && arr2[i]==key){
        return i;
      }
      return isfound;
    }
    public static int xpower(int x , int n){
       if(n==0){
        return 1;
       }
        int xnm1 = xpower(x,n-1);
        int xn= x * xnm1;
        return xn;
    }
    public static int optimizedpower (int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizedpower(x,n/2)*optimizedpower(x,n/2);
         if( n%2 != 0){
            halfpower = x *halfpower;
         }
         return halfpower;
    }
    public static void main (String args[]){
        int n=5;
       // printdec(n);
        //printinc(n);
        System.out.println(printfact(n));
        System.out.println(firstNnatural(n));
        System.out.println(fibnumber(n));
        int arr[]={1,2,3,4,5};
        System.out.println(checksortedarray(arr,0));
        int arr2[]={1,5,6,4,8,3,5,8,9};
        System.out.println(firstoccurance(arr2,10,0));
        System.out.println(lastoccurance(arr2,8,0));
        System.out.println(xpower(5,2));//time complexity is O(n)
        System.out.println(optimizedpower(5,2));//time complexity is O(log n) it is good
    }
}
