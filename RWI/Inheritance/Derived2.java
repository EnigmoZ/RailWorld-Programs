package Inheritance;

public class Derived2 extends Base{

    public Derived2(){
        System.out.println("This is Derived 2 class constructor");
    }

    @Override
    public void display(){
        System.out.println("I am in Derived 2");
    }
}
