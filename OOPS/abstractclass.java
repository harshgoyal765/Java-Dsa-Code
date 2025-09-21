public class abstractclass {
    public static void main(String args[]){
    Horse h = new Horse();//when we create object of child class then constructor of parent class is automatically called
    h.eat();
    h.walk();
    System.out.println(h.color);
    chicken c = new chicken();
    c.eat();
    c.walk();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";//creat a constructor to set color property to all child classes
    }
   void eat(){
    System.out.println("animal eats");
   }
   abstract void walk();//abstarct method
}
class Horse extends Animal{
    void walk(){
        System.out.println("horse walk on 4 legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("chicken walk on 2 legs");
    }
}
