package Programs;

public class Success {
    public static void main(String[] args) {
        String s = "success"; // su3ce2s
        char[] c = s.toCharArray();
        String encoded = "";
        int i = 0;

        while (i < c.length) {
            char ch = c[i];
            int count = 1;
            while (i + 1 < c.length && c[i + 1] == ch) {
                count++;
                i++;
            }
            if (count > 1) {
                encoded += count + "" + ch;
            } else {
                encoded += ch;
            }
            i++;
        }

        System.out.println(encoded);
    }
}
