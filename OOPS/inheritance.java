// package OOPS;
public class inheritance {
    public static void main(String args[]){
      student obj=new student();
      obj.name();
      obj.student();
    }
}
class person{ //parent class
    void name(){
        System.out.println("hello name");
    }
}
class student extends person{  //child class
    void student(){
        System.out.println("hello student");
    }
    // public static void main(String args[]){
    //   student obj=new student();
    //   obj.name();
    //   obj.student();
    // }
}
