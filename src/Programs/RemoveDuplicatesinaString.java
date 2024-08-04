package Programs;

public class RemoveDuplicatesinaString {
    public static void main(String[] args) {
        String s = "i am java developer, i  am will also want to learn python";
        String[] s1 = s.split(" ");
        String res = "";
        
        for (int i = 0; i < s1.length; i++) {
            String t = s1[i];
            boolean isDuplicate = false;
            
            // Check if the word has already been added to the result
            for (int j = 0; j < i; j++) {
                if (t.equals(s1[j])) {
                    isDuplicate = true;
                    break;
                }
            }   
            // Add the word to the result if it's not a duplicate
            if (!isDuplicate) {
                if (!res.isEmpty()) {
                    res += " ";
                }
                res += t;
            }
        }
        System.out.println(res);
    }
}
