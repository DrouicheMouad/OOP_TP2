package tp2.exo5;

public class TextAnalyzer {

    public String getLongestPrefix(String[] arrStrings) {
        String longestPrefix = "";
        for (int i = 0; i < arrStrings[0].length(); i++) {
            char c = arrStrings[0].charAt(i);
            for (int j = 1; j < arrStrings.length; j++) {
                if (i >= arrStrings[j].length() || arrStrings[j].charAt(i) != c)
                    return longestPrefix;
            }
            longestPrefix += c;
        }
        return longestPrefix;
    }
}