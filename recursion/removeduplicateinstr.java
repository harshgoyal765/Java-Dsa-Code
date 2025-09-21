package recursion;

public class removeduplicateinstr {
    public static void remduplicate(String str , int idx , StringBuilder newstr , boolean map[] ){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar = str.charAt(idx);
        if(map [currchar - 'a'] == true){
             // duplicate
             remduplicate(str, idx+1 , newstr , map);
        }
        else{
            map[currchar - 'a'] =true;
            remduplicate(str, idx+1 , newstr.append(currchar) , map);
        }
        
    }
    public static void main (String args[]){
        String str = "appnnacollege";
        remduplicate(str , 0 , new StringBuilder("") , new boolean[26]);
    }
}
