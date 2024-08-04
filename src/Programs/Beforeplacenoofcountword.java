package Programs;
import java.util.Scanner;

public class Beforeplacenoofcountword {
   public static void main(String[] args) {
        String s = "my name is eswar";//2my 4name 2is 5eswar
          Scanner scn = new Scanner(s);
        scn = scn.useDelimiter(" ");
        String res = "";
        while (scn.hasNext()) {
            String temp = scn.next();
            res += length(temp) + temp + " ";
        }
        System.out.println(res);
    }
    public static int length(String temp) {
        return temp.length();
    }
}
	
