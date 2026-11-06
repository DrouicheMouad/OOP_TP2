package tp2.exo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents;
        do {
            numberOfStudents = sc.nextInt();
            if (numberOfStudents <= 0) 
                System.out.println("ENTER A POSITIVE NUMBER ");
        }while(numberOfStudents <= 0);
        
        double[] grades = new double[numberOfStudents];
        System.out.print("Enter grades: ");
        for (int i = 0; i < numberOfStudents; i++) {
            grades[i] = sc.nextDouble();
        }
        StudentClass studentClass = new StudentClass();
        
        System.out.printf("Average: %.2f\n", studentClass.calculateAverage(grades));
        System.out.printf("Minimum: %.2f%n", studentClass.findMin(grades));
        System.out.printf("Maximum: %.2f%n", studentClass.findMax(grades));
        sc.close();
}
}