public class Interfacedef {
    public static void main(String args[]){
       Queen obj = new Queen();
       obj.moves(); 
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("queen moves on - left,right,diagonal,up,down");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook moves on - left,right,up,down");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("King moves on - left,right,diagonal,up,down (only one step)");
    }
}


// public class Interfacedef{
//     public static void main (String args[]){
//        main obj= new main();
//        obj.print();
//        obj.show();
//     }
// }
// interface print{
//     abstract void print();
// }
// interface show extends print{
//     abstract void show();
// }
// class main implements show{
//     public void print (){
//         System.out.println("hello");
//     }
//     public void show(){
//         System.out.println("mister");
//     }
// }