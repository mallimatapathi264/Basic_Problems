package Programs;
public class MiddleCharUpper {
    public static void main(String[] args) {
        String s = "mallikarjunaswamy";
        System.out.println(s.length());
        int length = s.length();
        int middle = length / 2;
        String s1 = "";
        if (length % 2 == 0) {
s1=s.substring(0,middle-1)+Character.toUpperCase(s.charAt(middle-1))+s.substring(middle+1);
        } else {
s1=s.substring(0,middle)+Character.toUpperCase(s.charAt(middle))+s.substring(middle+1);
        }
        System.out.println(s1);
    }
}
