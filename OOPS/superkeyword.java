public class superkeyword {
    public static void main(String args[]){
      Horse h = new Horse();
      System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
}
class Horse extends Animal{ 
    Horse(){
        super.color="brown";//set the immediate parent class color property by super keyword
        System.out.println("horse constructor called");
    }
}
