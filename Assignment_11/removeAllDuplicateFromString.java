// You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

// We repeatedly make duplicate removals on s until we no longer can.

// Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 
public class removeAllDuplicateFromString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        int i = 0;
		char[] res = s.toCharArray();
       
        for (int j = 0; j < s.length(); ++j, ++i) {
		    res[i] = res[j];
			if (i > 0 && res[i - 1] == res[i]) 
			    i -= 2;
        }
       
        return new String(res, 0, i);
    }
    
}
