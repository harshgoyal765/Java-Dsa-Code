import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input= sc.next();  // next() function save only one word of the line;
        System.out.println(input);
        
        String name=sc.nextLine();
        System.out.print(name);
           
   
      //simlarily 
      //for input integers we use nextInt()
       //for input decimal numbers we use nextFloat()
        //for input byte numbers we use nextByte()
         //for input double float numbers we use nextDouble()
       //for input boolean we use nextBoolean()
        //for input short integers we use nextShort()
         //for input long integers we use nextLong()

         int a=sc.nextInt();
         System.out.print(a);
   
         sc.close();
   
   
   
   
    }
}
