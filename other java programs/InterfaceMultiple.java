//29.Implement multiple inheritances using an interface
interface Apple {
    public void methodApple();
}

interface Banana {
    public void methodBanana();
}

public class InterfaceMultiple implements Apple, Banana {
    public void methodApple() {
        System.out.println("i love apple");
    }

    public void methodBanana() {
        System.out.println("i love banana");
    }

    public static void main(String[] args) {
        InterfaceMultiple obj = new InterfaceMultiple();
        obj.methodApple();
        obj.methodBanana();
    }
}
/*                        output:

i love apple
i love banana



 */

