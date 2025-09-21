// package OOPS ;

public class constructor {
    public static void main(String args[]){
        Student obj1 = new Student();//nonparametrized constructor
        Student obj2 = new Student("ram");//parametrized constructor
        Student obj3 = new Student(12);
        obj1.name="shayam";
        obj1.age=15;
        Student obj4 =new Student(obj1);//call copy constructor
        obj4.getinfo();
     }
 }
     class Student{
         //properties
         String name;
         int age;
         Student(Student obj1){  //copy constructor
            this.name=obj1.name;
            this.age=obj1.age;
         }
         void getinfo(){
            System.out.println(name);
            System.out.println(age);
         }
         Student(){
            System.out.println("constructor call");
         }
         Student(String name){
           this.name=name;
           System.out.println(name);
         }
         Student(int age){
           this.age=age;
           System.out.println(age);
         }

}
