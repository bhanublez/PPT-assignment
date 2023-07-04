package Assignment_7;
public class AddStrings {

    static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += (num1.charAt(i--) - '0');
            if (j >= 0) sum += (num2.charAt(j--) - '0');

            sb.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        String  num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));
        
    }
    
}
