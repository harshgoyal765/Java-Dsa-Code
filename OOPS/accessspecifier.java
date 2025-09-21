
// package OOPS;

public class accessspecifier {
    public static void main(String args[]){
     Customer first=new Customer();
     first.name="ram";
     first.setPassword("abcdefgh");
     System.out.println(first.name );
     System.out.print(first.printPassword());
    }
}
    class Customer{
        public String name;
        private String password;
        public void setPassword(String pwd){
            password=pwd;
        }
        public String printPassword(){
            return password;
        }
    }

