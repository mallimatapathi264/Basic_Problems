package Programs;

public class FindMissingVowels {

	    public static void main(String[] args) {
	        String s1 = "java";  
	        String res = "";     
	        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; 
	        	        for (int i = 0; i < vowels.length; i++) {
	            if (s1.indexOf(vowels[i]) == -1) {
	                res += vowels[i]; 
	            }
	        }
	        System.out.println(res); 
	    }
	}
