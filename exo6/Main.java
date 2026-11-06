package tp2.exo6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixOperations ops = new MatrixOperations();

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        System.out.println("=== Matrix Addition (3 x 3) ===");
        System.out.println("Enter the elements of Matrix A, row by row:");
        ops.read(A, sc);

        System.out.println();
        System.out.println("Enter the elements of Matrix B, row by row:");
        ops.read(B, sc);

        System.out.println();
        System.out.println("Matrix A:");
        ops.print(A);

        System.out.println();
        System.out.println("Matrix B:");
        ops.print(B);

        System.out.println();
        int[][] result = ops.add(A, B);
        if (result != null) {
            System.out.println("Result (A + B):");
            ops.print(result);
        }
        sc.close();
    }
}