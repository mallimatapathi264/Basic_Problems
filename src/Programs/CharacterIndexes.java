package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharacterIndexes {
	public static void main(String[] args) {
	String s="mallikarjuna swamy matapathi";
	Map<Character, String> m= new HashMap();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)== ' ') continue;
	char c=s.charAt(i);
	if(!m.containsKey(c))
	{
		m.put(c, i+"");
	}
	else
	{
		String value=m.get(c);
		m.put(c,value+","+i);
	}
	}
	Set<Character> s1= m.keySet();
	Iterator i=s1.iterator();
	while(i.hasNext())
	{
		Character c1= (Character) i.next();
		String v= m.get(c1);
		System.out.println(c1+"="+v);
	}
	}
}
