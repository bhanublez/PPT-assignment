package Assignment_8;
import java.util.*;

public class FindAllAnagramsString {

    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        Map<Character, Integer> pHash = new HashMap<>();
        Map<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pHash.put(p.charAt(i), pHash.getOrDefault(p.charAt(i), 0) + 1);
        }
        int left = 0, right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            hash.put(c, hash.getOrDefault(c, 0) + 1);
            right++;
            if (pHash.equals(hash)) {
                res.add(left);
            }
            if (right - left == p.length()) {
                char leftChar = s.charAt(left);
                if (hash.containsKey(leftChar)) {
                    hash.put(leftChar, hash.get(leftChar) - 1);
                    if (hash.get(leftChar) == 0) {
                        hash.remove(leftChar);
                    }
                }
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
        
    }
    
}
