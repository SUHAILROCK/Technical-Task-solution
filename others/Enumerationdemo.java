//30.Java program for Enumeration
import java.util.*;

public class Enumerationdemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Red");
        v.add("Green");
        v.add("Blue");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
//              output:
//          Red
//          Green
//          Blue
