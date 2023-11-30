//Code 1
public class Method_Overloading {
    public static void display(int x) {
        System.out.println("Displaying Value of X: " + x);
    }

    public static void display(int x, int y) {
        System.out.println("Displaying value of X and Y: " + x + " " + y);
    }

    public static void main(String[] args) {
        display(10);
        display(10, 20);
    }
}

//Code 2
/*class Method {
    public void display(int x) {
        System.out.println("Displaying Value of X: " + x);
    }

    public void display(int x, int y) {
        System.out.println("Displaying value of X and Y: " + x + " " + y);
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Method meth = new Method();
        meth.display(10);
        meth.display(10, 20);
    }
}*/
