import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Employee emp = new Employee();
        Address adr = new Address();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, age, city, and pin: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        String city = sc.next();
        int pin = sc.nextInt();

        emp.setName(name);
        emp.setAge(age);
        adr.setCity(city);
        adr.setPin(pin);
        emp.setAddress(adr);
        System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getAddress().getCity() + "," + emp.getAddress().getPin());
        sc.close();
    }
}