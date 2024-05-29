package Recursion;

public class Fibonacci {
    static int a=0,b=1,c=0;
    public static void fibo(int n){

        if(n>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" " + c);
            fibo(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(" 10 elements of fibonacci series ");
        int n = 10;
        System.out.print(0 +" "+ 1);
        fibo(n);
    }
}
