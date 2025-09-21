// package OOPS;

public class Javaclass {
    public static void main(String args[]){
       Pen p1 = new Pen();//create an object p1 of class pen
       p1.setcolor("blue");
       p1.settip(8);
       System.out.println(p1.color);
       System.out.println(p1.tip);
    }
}
    class Pen{
        //properties
        String color;
        int tip;
        //function
        void setcolor(String newcolor){
            color=newcolor;
        }
        void settip(int newtip){
            tip=newtip;
        }
    }

