package Assignment_8;
import java.util.Stack;

public class DecodeString {
    static String decodeString(String s) {
        Stack<Integer>numStack=new Stack<>();
        Stack<StringBuilder>strBuild=new Stack<>();
        StringBuilder str = new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                num=num*10 +c -'0';
            }
            else if(c=='['){
                strBuild.push(str);
                str=new StringBuilder();
                numStack.push(num);
                num=0;
            }else if(c==']'){
                StringBuilder temp=str;
                str=strBuild.pop();
                int count=numStack.pop();
                while(count-->0){
                    str.append(temp);
                }
            }else{
                str.append(c);
            }
        }
        return str.toString();
    } 

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));

        
    }
}
