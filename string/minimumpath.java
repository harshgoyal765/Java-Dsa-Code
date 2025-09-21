public class minimumpath {
    public static float getshortpath(String path){
        int x=0 ; int y=0;
        for(int i=0 ; i<path.length() ; i++){
            char dir=path.charAt(i);
            //south
           if (dir=='S'){
                y--;
            }
            //north
            else if (dir=='N'){
                y++;
            }
            //west
            else if (dir=='W'){
                x--;
            }
            //east
            else if (dir=='E'){
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    
    public static void main(String args[]){
       String path = "WNEENESENNN";
       System.out.println(getshortpath(path)); 
       String s1 = "tony";
       String s2 = new String ("tony");
       if(s1.equals(s2)) {
        System.out.println("it is equal");
       }
       else{
        System.out.println("it is not equal");
       }           
    }
}
