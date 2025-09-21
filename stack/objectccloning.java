public class objectccloning {
    class Main implements Cloneable {
        String name;
        int age; 
    public static void main (String args[]){
        //create an object of main class 
       Main obj1 = new Main();
       obj1.name="harsh";
       obj1.age=23;
       System.out.println(obj1.name);
       System.out.println(obj1.age);

       Main obj2=(Main)obj1.clone();
       System.out.println(obj2.name);
       System.out.println(obj2.age);
    }
    catch (Exception e){
        System.out.println(e);
     }
   }
}
 