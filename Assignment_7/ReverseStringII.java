package Assignment_7;
public class ReverseStringII {
    static String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i += 2*k) {
            // Creating the separator for every iteration.
            int j = Math.min(i + k, n);
            // Substring to reverse first k elements
            StringBuilder rev = new StringBuilder(s.substring(i, j));
            rev.reverse();
            sb.append(rev);
            // Substring to append the rest elements.
            int rem = Math.min(i + 2*k, n);
            sb.append(s.substring(j, rem));
        }
        // Converting back the StringBuilder to String
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        System.out.println(reverseStr(s, k));
        
    }
}
