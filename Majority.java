import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int count=0;
        for(int i : arr){
            if(i == x){
                count++;
            }
        }
        if(count >=(n/2)) System.out.println("True");
        else System.out.println("False");
    }
}
