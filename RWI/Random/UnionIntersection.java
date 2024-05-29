package Random;

import java.util.Scanner;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size or array 1: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of array 2: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Input array 1: ");
        for(int i=0;i<n;i++){
            System.out.print("arr1["+i+"]: ");
            arr1[i] = sc.nextInt();
            System.out.println();
        }

        for(int i=0;i<m;i++){
            System.out.print("arr2["+i+"]: ");
            arr2[i] = sc.nextInt();
            System.out.println();
        }


        
    }
}
