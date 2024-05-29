package Inheritance;

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        Base b1 = new Derived();
        Base b2 = new Derived2();

        b.display();
        b1.display();
        b2.display();
    }
}
