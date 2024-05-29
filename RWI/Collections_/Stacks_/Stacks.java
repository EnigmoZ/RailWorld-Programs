package Collections_.Stacks_;

import Collections_.ArrayLists_.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Employee> stack = new Stack<>();
        ArrayList<Employee> emp = new ArrayList<>();
        int i=0;
        int id;
        char ch = 'Y';
        String name, position;
        do{
            System.out.println("Enter Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            name = sc.next();
            sc.nextLine();
            System.out.println("Enter Position: ");
            position = sc.next();
            sc.nextLine();
            emp.add(new Employee(id,name,position));
            stack.push(emp.iterator().next());
            System.out.println("Do you have next employee data (Y/N): ");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');

        System.out.println("Here is the stack of employees");
        System.out.println(stack);
        System.out.println("The element popped is" + stack.pop());
        System.out.println("now the stack is " + stack);

    }
}
