package Programs;

public class PrintOccuranceofEachVowels {
    public static void main(String[] args) {
        String s = "malayalam";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int maxCount = 0;
        char maxVowel = '\u0000';
        
        for (char vowel : vowels) {
            int count = s.length() - s.replace(vowel + "", "").length();
            if (count > maxCount) {
                maxCount = count;
                maxVowel = vowel;
            }
        }
        
        System.out.println("The vowel '" + maxVowel + "' occurs the most with " + maxCount + " times.");
    }
}
