public class genericMethod{
  public static <T> void printvalue(T value){
    System.out.println(value);
  } 
  public static void main(String args[]){
    genericMethod obj = new genericMethod();
    obj.printvalue(18);
    obj.printvalue("hello");
  }
}