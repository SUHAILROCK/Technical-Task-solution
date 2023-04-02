//22.How do you write an interface with default and static method?
interface Interface {

    void doSomething();

    default void doSomethingElse() {
        System.out.println("reading books");
    }

    static void doAnotherThing() {
        System.out.println("learning java");
    }
}

class MyClass implements Interface {

    @Override
    public void doSomething() {
        System.out.println("playing chess");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.doSomething();      
        obj.doSomethingElse();  
        Interface.doAnotherThing();
    }
}
/*                output:
playing chess
reading books
learning java



 */

