class myexception extends Exception{
  myexception(String s){
    super(s);
  }
}
public class throwsExcep{
    void validage(int age) throws myexception{
      if(age<18){
        throw new ArithmeticException("not valid to give vote");
      }
      else{.
        System.out.println("welcome to vote");
      }
    }
    public static void main(String args[]){
      throwsExcep obj = new throwsExcep();
      try{
        obj.validage(17);
      }
      catch(myexception my){
        System.out.println(my);
      }
    }
}