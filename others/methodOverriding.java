//5.Write a program to demonstrate method overriding?
class Suhail {
    public void Color() {
        System.out.println("pick your color: ");
    }
}

class Person extends Suhail {
    @Override
    public void Color() {
        System.out.println("I like blue");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Suhail obj1 = new Suhail();
        Person obj2 = new Person();

        obj1.Color();
        obj2.Color(); 
    }
}

/*                output:
pick your color: 
I like blue
 */
