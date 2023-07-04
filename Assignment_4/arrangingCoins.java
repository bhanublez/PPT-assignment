package Assignment_4;

public class arrangingCoins {
 
    static int arrangeCoins(int n) {
        long start=1;
        long sum=1;
        while( sum <= n){
            sum+= ++start;
        }
        
        return (int) start-1;
    }
    
    public static void main(String[] args) {

        int n = 5;
        System.out.println(arrangeCoins(n));
    }
   
}
