class Test <T>{
  T obj;
  Test(T obj){
    this.obj = obj;
  }
  T getobject(){
    return this.obj;
  }
}
public class genericClass{
  public static void main (String args[]){
    Test<Integer> obj1 = new Test<>(19);
    System.out.println(obj1.getobject());
    Test<String> obj2 = new Test<>("hello");
    System.out.println(obj2.getobject());
  }
}