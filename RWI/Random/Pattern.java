package Random;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int line;
        int d = 1;
        for(line = 1; line<=n;){
            if(line >= d){
                System.out.print(d+" ");
                d++;
                continue;
            }

           else{
                line++;
                d = 1;
                System.out.println();
            }
        }
    }
}
