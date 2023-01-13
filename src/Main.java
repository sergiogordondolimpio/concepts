import objectsfolder.ClassWithConstructor;
import objectsfolder.ClassWithStaticMethod;
import objectsfolder.First;

public class Main {
    public static void main(String[] args) {
        // Instance
        First first = new First();
        ClassWithConstructor classWithConstructor = new ClassWithConstructor();

        System.out.println(first.x);
        // change the value
        first.x = 20;
        System.out.println(first.x);

        first.myMethod();

        // Static
        ClassWithStaticMethod.myStaticMethod();

    }
}