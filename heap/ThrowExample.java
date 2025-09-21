public class ThrowExample {
    void testAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid"); // Throws exception if age < 18
        } else {
            System.out.println("Age is valid for vote"); // Otherwise prints valid message
        }
    }

    public static void main(String args[]) {
        ThrowExample obj = new ThrowExample();
        try{
          obj.testAge(18);
        }
        catch(ArithmeticException e){
          System.out.print(e.getMessage());
        }
    }
}
