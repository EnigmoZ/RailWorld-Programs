package Arrays;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0;i<n;i++)
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        System.out.println("The Matrix is: ");
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Diagonal1: ");
        int i=0,j=0;
        while(i<n && j<m){
            System.out.print(matrix[i++][j++]+" ");
        }
        
        System.out.print("Diagonal2: ");
        i=0;
        j=m-1;
        while(i<n && j>-1){
            System.out.print(matrix[i++][j--]+" ");
        }
        System.out.println();

        System.out.println("Lower Matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Upper Matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(j<i) System.out.print("  ");
                else System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

//        System.out.println("Matrix multiplication: ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int[][] matrix2 = new int[a][b];
//        for(i=0;i<a;i++)
//            for(j=0;j<b;j++){
//                matrix2[i][j] = sc.nextInt();
//            }
//        int[][] multimatrix = new int[n][b];
//        if(m==a){
//            for(i = 0;i<n;i++)
//                for(j=0;j<m;j++){
//                    multimatrix = matrix[][]
//                }
//        }
//        else{
//            System.out.println("Incompatible matrices!");
//        }
        sc.close();
    }
}
