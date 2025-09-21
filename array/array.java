// import java.util.*;
// public class array {
//     public static void main(String args[]){
//       int marks[]= new int[50];
//       Scanner sc=new Scanner(System.in);
//       marks[0]=sc.nextInt();//input physics marks
//       marks[1]=sc.nextInt();//input maths marks
//       marks[2]=sc.nextInt();//input chemistry marks
//       marks[2]=marks[2]+1;
//       System.out.println("physics : " +marks[0]);//output the elements of array
//       System.out.println("maths : " +marks[1]);
//       System.out.println("chemistry : " +marks[2]);
//       sc.close();
//     }
// }
//array pass by reference
public class array{
  public static void update(int marks[]){
    for(int i=0 ; i<marks.length ; i++ ){
      marks[i]=marks[i] + 1;
    }
  }
  public static void main(String args[]){
    int marks[]={98,87,95};
    update(marks);
    for(int i=0 ; i<marks.length ; i++){
      System.out.print(marks[i] +" ");
    }
    System.out.println();
  }
}