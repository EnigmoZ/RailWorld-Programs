package Random;

import  java.util.Scanner;
public class Start {
    //program to find 2nd largest element in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sl=-1, l=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > l){
                sl = l;
                l = arr[i];
            }
        }
        System.out.println("Second largest: "+sl);
    }


}
