package Employee;

import java.util.Scanner;

public class Ebill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the consumed units: ");
        int units=sc.nextInt();
        int bill = units<101 ? 100*2 :
                   units <151 ? 100*2 + (units - 100)*3 :
                   units <201 ? 100*2 + 50*3 + 50*4 :
                   100*2 + 50*3 + 50*4 + (units-200)*5;
        System.out.println("Electricity bill is : " + bill);
        sc.close();
    }
}
