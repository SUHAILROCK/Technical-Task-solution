//31.Implement method overloading & overriding in java
class Demo {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public void display() {
        System.out.println("hi my name is suhail");
    }

}

public class Method extends Demo {

    public void display() {
        System.out.println("my age is 21 ");
    }

    public static void main(String[] args) {
        Demo demoObj = new Demo();
        System.out.println("give a two parameter using addtion: " + demoObj.add(10, 20));
        System.out.println("give a three parameters using addtion: " + demoObj.add(10, 20, 30));
        demoObj.display();

        Method obj1 = new Method();
        obj1.display();
    }

}

/*
                        Output:
    give a two parameter using addtion: 30
    give a three parameters using addtion: 60
    hi my name is suhail
    my age is 21 
 */