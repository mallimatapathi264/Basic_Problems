package Programs;

public class findVowels {
	 /*    public static void main(String[] args) {
       String s1 = "java";//output=eiou
        String res = "";
        int cou=0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] c = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
        	
            for (int j = 0; j < vowels.length; j++) {
            	cou++;
                if (c[i] == vowels[j]) {
                    if (res.indexOf(vowels[j]) == -1) {
                        res += vowels[j];
                    }
                    break;
                }
            }
        }

        System.out.println(res+""+cou); // Output the result string containing unique vowels
    }
}*/

	public static void main(String[] args) {
        String s1 = "java";  
        String res = "";     
        int count=0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; 
        	        for (int i = 0; i < vowels.length; i++) {
        	        	count++;
            if (s1.indexOf(vowels[i]) != -1) {
                res += vowels[i]; 
            }
        }
        System.out.println(res+""+count); 
    }
}
