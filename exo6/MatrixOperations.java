package tp2.exo6;

import java.util.Scanner;

public class MatrixOperations {

    public void read(int[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
        	//m.lenght = number of rows in the matrix
            System.out.print("Row " + (i + 1) + " (Enter " + m[i].length + " numbers separated by spaces): "); 
            // m[i].lenght = number of elements in row i = numbers of columns in the matrix 
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = sc.nextInt();
        }
    }

    public boolean sameSize(int[][] m1, int[][] m2) {
        return m1.length == m2.length && m1[0].length == m2[0].length;
    }

    public int[][] add(int[][] m1, int[][] m2) {
        if (!sameSize(m1, m2))
        {
            System.out.println("Matrix addition cannot be performed between matrices of different sizes.");
            return null;
        }
        int[][] sum = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[i].length; j++)
                sum[i][j] = m1[i][j] + m2[i][j];
        return sum;
    }

    public void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.printf("%4d", m[i][j]);
            System.out.println();
        }
    }
}