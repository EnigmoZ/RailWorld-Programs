import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before a: "+a+" b: "+b);
        //using arithmatic
//        a=a+b;
//        b=a-b;
//        a=a-b;

        //using xor
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After a: "+a+" b: "+b);
    }
}
