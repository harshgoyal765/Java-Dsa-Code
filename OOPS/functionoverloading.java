//compile time polymorphism
public class functionoverloading{
   public static void main(String args[]){
    Calculator obj= new Calculator();
    System.out.println(obj.sum(1,5));
    System.out.println(obj.sum((float)1.5,(float)2.5));
    System.out.println(obj.sum(1,5,6));
   }
}
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum (int a , int b, int c){
        return a+b+c;
    }
}