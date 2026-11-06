package tp2.exo5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n;
        do {
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("ENTER A POSITIVE NUMBER");
        } while (n <= 0);

        String[] arrStrings = new String[n];
        System.out.print("Enter strings: ");
        for (int i = 0; i < n; i++)
            arrStrings[i] = sc.next();

        TextAnalyzer analyzer = new TextAnalyzer();
        String prefix = analyzer.getLongestPrefix(arrStrings);

        if (prefix.isEmpty())
            System.out.println("No common prefix.");
        else
            System.out.println("Longest common prefix: " + prefix);

        sc.close();
    }
}