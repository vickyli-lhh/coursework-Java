import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class Solution {
	public String recapitalized(String sentence) {
       	// Here is your code //
		String rs = "";
		String str[] = sentence.split(" ");
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for (String s : al) {
			if (s.length() < 3) {
				s = s. toLowerCase();
			}else {
				String firstLetter = s.substring(0, 1);
			    String remainingLetters = s.substring(1, s.length()). toLowerCase();

			    // change the first letter to uppercase
			    firstLetter = firstLetter.toUpperCase();

			    // join the two substrings
			    s = firstLetter + remainingLetters;
			}
			rs += s + " ";
		}
		return rs;
	}
	
	public int counting(String s, int k) {
       	// Here is your code //
        ArrayList<Character> list = new ArrayList<Character>();
        ArrayList<Integer> nlist = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++)
        {
            char currentCharacter = s.charAt(i);//getting the character at current index
            list.add(currentCharacter);//adding the character to the list
        }
        for(int i = 0; i < s.length(); i++)
        {
	        int n = s.toUpperCase().charAt(i) - 64;
	        nlist.add(n);	       
        }
        int a = 0;
        String c = "";
        while(a < k) {
        	for(int b = 0 ; b < nlist.size(); b++) {
        		c += nlist.get(b);  
        	}
        	int ic = Integer.parseInt(c); 
        		
        	LinkedList<Integer> stack = new LinkedList<Integer>();
            while(ic > 0){
                stack.push(ic % 10);
                ic = ic / 10;
            }
            System.out.println(ic);
        	a++;
        }
        String sss = "";
        System.out.println(nlist);
        for(int i = 0; i < nlist.size(); i++) {
        	sss += nlist.get(i).toString();
        }
        int re = Integer.parseInt(sss); 
        return re;
	}
}
