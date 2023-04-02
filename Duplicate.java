//4.write a program to remove duplicate in an arraylist
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("suhail");
        list.add("faizal");
        list.add("alji");
        list.add("suhail");
        list.add("irfan");
        list.add("aslam");

        Set<String> set = new HashSet<>(list);

        List<String> newList = new ArrayList<>(set);

        System.out.println("Original ArrayList: " + list);
        System.out.println("ArrayList without duplicates: " + newList);
    }
}
/*
 *                     Output:-
 *  Original ArrayList: [suhail, faizal, alji, suhail, irfan, aslam]
 *  ArrayList without duplicates: [suhail, faizal, alji, irfan, aslam]
 */

