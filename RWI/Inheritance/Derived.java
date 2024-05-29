package Inheritance;

public class Derived extends Base{

    public Derived(){
        System.out.println("This is Derived class constructor");
    }

    @Override
    public void display(){
        System.out.println("I am in derived");
    }
}
