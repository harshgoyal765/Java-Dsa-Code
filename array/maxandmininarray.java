public class maxandmininarray {
   
     public static int getnum(int marks[]){
     int largest=Integer.MIN_VALUE;//it is equal to -infinity
     int smallest=Integer.MAX_VALUE;//it is equal to +infinity
     for(int i=0 ; i<marks.length ; i++ ){
        if(marks[i]>largest){
            largest=marks[i];
        }
        if(marks[i]<smallest){
            smallest=marks[i];
        }
    }
        System.out.println(smallest);
        return largest;
          
    }
    public static void main(String args[]){
          int marks[]={98,87,95,56,89,87};
          
          System.out.println(getnum(marks));
          
          }
          
 }

