import java.util.*;

public class area {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("give radius of circle");
      float radius=sc.nextFloat();
      Double area = (3.14)*(radius)*(radius);
      System.out.println("Area is");
      System.out.println(area);
      sc.close();
    }
  }
