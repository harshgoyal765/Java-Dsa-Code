public class palindromestring {
    public static void main (String args[]){
      String str = "roor";
      System.out.println(check(str));
      if (check(str)==true){
       System.out.println("it is palindrome");     
      }
      else{
        System.out.println("it is not palindrome");
      }
    }
     public static boolean check(String str){
        for(int i=0 ; i<str.length()/2 ; i++){
            int n = str.length();
          if( str.charAt(i) != str.charAt(n-1-i)){
              return false;
            }
        }
        return true;
    }
}
