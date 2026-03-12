
import java.util.*;
class Main {
    public static void cal(int maths , int Bio , int eng , int Hindi,int social){
        float perc = (maths+Bio+eng+Hindi+social)/5.0f;
        System.out.println(perc);
        if (maths>=90 && Bio>=90&& perc>80){
            System.out.print("JEE"+","+" Medical");
        }
        else if(maths>=90 && Bio>=70&& perc>80){
            System.out.print("JEE");
        }
        else if(Bio>=90&& perc>60){
            System.out.print("Medical");
        }
        else{
            System.out.print("Fail");
        }
        

    }
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int maths = sc.nextInt();
     int Bio = sc.nextInt();int eng = sc.nextInt();int Hindi = sc.nextInt();int social = sc.nextInt();
     cal(maths,Bio,eng,Hindi,social);
    }
}