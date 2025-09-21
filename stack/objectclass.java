public class objectclass{
    public static void main(String args[]){
        //.equals() object class property
        //create an object of Object class 
        // Object obj1 = new Object();
        // Object obj2 = new Object();
        // System.out.println(obj1.equals(obj2));
        // Object obj3 = obj1;
        // System.out.println(obj1.equals(obj3));




        //.toString() object class property
        // Object obj1 = new Object();
        // System.out.println("object class string :"+ obj1.toString());//output is java.lang.Object@372f7a8d



        //.getClass() object class property
        // Object obj1 = new Object();
        // System.out.println(obj1.getClass());//output is class java.leng.Object


        //.hashCode() object class property 
        Object obj1 = new Object(); 
        System.out.println(obj1.hashCode());//it always return a integer value which associated with object
    }

}