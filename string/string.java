import java.util.*;
public class string {
    public static void printcharacters(String str){
        for(int i=0 ; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
    
    public static void main (String args[]){
        String str="abcd";//declare string str
        //String str2=new String("abcd");//declare string str2
        //string are immutable
        //input string
        Scanner sc=new Scanner (System.in);
        String name;
        //name = sc.next();//print only first entered name
        //output string
         //System.out.print(name);
         name=sc.nextLine();//to print whole line
         System.out.println(name);
         sc.close();
         //string length
         System.out.println(name.length());
         //concatenation
         String firstname="harsh";
         String lastname="goyal";
         String fullname =firstname + " " + lastname;
         System.out.println(fullname);
         printcharacters(str);
    }
}
