package tp2.exo4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        
        textAnalyzer.analyze(text);
        textAnalyzer.printVowelsConsonants();
        
        sc.close();
    }
}
