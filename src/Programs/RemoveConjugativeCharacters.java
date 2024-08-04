package Programs;

public class RemoveConjugativeCharacters {
    public static void main(String[] args) {
     String s="successessss";
       String s1="";
        int count=0;
        char[] c=s.toCharArray();
        for (int i=0; i<c.length-1; i++) {
        	
            if (c[i] == ' ') continue;
            count++;
            if (c[i]!= c[i+1]) {
                //c[i] = ' ';
            	 s1+=c[i]+"";
            }
        }
        //if(c[c.length-1]!=' ') {
        	s1+=c[c.length-1];
        //}
        System.out.println(s1+" "+count);
    }
}

        
        /*
        int count=0;
        String res="";
        for(int i=1;i<s.length();i++)
        {
        	count++;
        char c1=s.charAt(i);
        char c2=s.charAt(i-1);
        if(c1!=c2) 
        	res+=c2;
        }
        res+=s.charAt(s.length()-1);
        System.out.println(res+" "+count);

    }
}
 */
    
    	








