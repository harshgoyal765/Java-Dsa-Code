public class functionoverriding {
    public static void main(String args[]){
    Deer obj = new Deer ();
    obj.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("animal eats everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
