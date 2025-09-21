public class substring {
    public static String findsubstring( String name , int si , int li){
     String substring ="";
     for(int i=si ; i<li ; i++){
        substring+=name.charAt(i);
     }
     return substring;
    } 
    public static void main(String args[]){
        String name ="harsh";
        System.out.println(findsubstring(name , 0,4));
        System.out.print(name.substring(0,4));
       
        
    }
}
