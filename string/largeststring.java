public class largeststring {
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder ("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1 ;i<str.length() ; i++){
            if(str.charAt(i) ==' ' && i<str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();
    }
    public static String compress(String characters){
        String newstr="";
        for (int i=0 ; i<characters.length() ; i++){
              Integer count=1;
              while(i<characters.length()-1 && characters.charAt(i)==characters.charAt(i+1)){
                count++;
                i++;
              }
              newstr +=characters.charAt(i);
              if(count>1){
                newstr +=count.toString();
              }

        }
        return newstr;
    }
   
    public static void main(String args[]){
    String fruits[] = {"apple","mango" ,"banana"};
    String largest=fruits[0];
    for(int i=0 ; i< fruits.length ; i++){
        if(largest.compareTo(fruits[i])<0){
           largest=fruits[i];
        }
    }
    System.out.print(largest);
    StringBuilder sb = new StringBuilder ("");
    for(char ch='a' ; ch<'z' ; ch++){
        sb.append(ch);
    }
    System.out.println(sb);
    String str="hi, i am harsh ";
    System.out.print(touppercase(str));
    String characters="aaabbcccdd";
    System.out.print(compress(characters));
   }
}
