package Collections_.ArrayLists_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
//        al.add(1);
//        al.add("Mayank");
//        al.add(23.4f);
//        System.out.println(al);
//        System.out.println(al.get(2));
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> al = new ArrayList<>();
        System.out.println("Enter the number of employees : ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for(int i=0;i<n;i++){
            emp[i] = new Employee();
            System.out.println("Enter id of employee-"+i+1+":");
            emp[i].setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter name of employee-"+i+1+":");
            emp[i].setName(sc.next());
            sc.nextLine();
            System.out.println("Enter position of employee-"+i+1+":");
            emp[i].setPosition(sc.next());
            al.add(emp[i]);
            sc.nextLine();
        }
        System.out.println(al);
        for(Employee e:al){
            System.out.println(e);
        }

        Iterator<Employee> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
