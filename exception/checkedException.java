import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class checkedException{
  public static void main(String args[]){
  try{
    File file = new File("E://file.txt");
    FileReader fr = new FileReader(file);
    
  }
  catch(FileNotFoundException e){
    System.out.println(e);

  }

  }
}