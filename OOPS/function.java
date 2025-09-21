// package OOPS;

public class function {
    public static void main(String args[]) {
        // Create an object p1 of class Pen
        Pen p1 = new Pen();
        
        // Set properties of p1
        p1.setcolor("blue");
        p1.settip(8);
        
        // Print out the values of color and tip
        System.out.println(p1.getcolor());  // Output: blue
        System.out.println(p1.gettip());    // Output: 8
    }
}

class Pen {
    // Private properties
    private String color;
    private int tip;

    // Getter for color
    public String getcolor() {
        return this.color;
    }

    // Getter for tip
    public int gettip() {
        return this.tip;
    }

    // Setter for color
    public void setcolor(String newcolor) {
        this.color = newcolor;
    }

    // Setter for tip
    public void settip(int newtip) {
        this.tip = newtip;
    }
}

