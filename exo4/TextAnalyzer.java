package tp2.exo4;

public class TextAnalyzer {
	private int[] arrVowels;
	private int consonants ;
    private boolean isVowel(char c) {  //it's private cuz we want to use it just inside this class 
	    String vowels = "aeiou";
	    return vowels.indexOf(c) != -1;
	}
    public void analyze(String text) {
    arrVowels = new int[5]; // a, e, i, o, u 
    consonants = 0;
    	text = text.toLowerCase();
    	  for (int i = 0; i < text.length(); i++) {
              char c = text.charAt(i);
              if (isVowel(c)) {
                  switch (c) {
                      case 'a': arrVowels[0]++; break;
                      case 'e': arrVowels[1]++; break;
                      case 'i': arrVowels[2]++; break;
                      case 'o': arrVowels[3]++; break;
                      case 'u': arrVowels[4]++; break;
                  }
              } else if (c >= 'a' && c <= 'z') {
            	  consonants++;
              }
          }
    }
    public void printVowelsConsonants() {
        System.out.printf("a: %d, e: %d, i: %d, o: %d, u: %d%n", arrVowels[0], arrVowels[1], arrVowels[2], arrVowels[3], arrVowels[4]);
        System.out.println("Number of consonants: " + consonants);
    }
}