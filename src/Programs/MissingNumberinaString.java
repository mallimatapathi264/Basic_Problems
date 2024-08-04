package Programs;

public class MissingNumberinaString {
	public static void main(String[] args) {
		/*
	        String s = "012346789";
	        StringBuilder s1 = new StringBuilder();
	        
	        for (char c = '0'; c <= '9'; c++) {
	            if (!s.contains(c + "")) {
	                s1.append(c); // Append the missing digit
	            } else {
	                s1.append(c);
	            }
	        }

	        System.out.println(s1.toString());
	    }
}
	*/
		String s = "012346789";
		String s1="";
		for (char c = '0'; c <= '9'; c++) {
			if (!s.contains(c + "")) {
				s1+=c+"";
			}
			else
			{
				s1+=c+"";
			}
		}
		System.out.println(s1);
	}
}























