package Assignment_6;
public class spiralMatrixII {

    static int[][] generateMatrix(int n) {
        int num[][] = new int[n][n];
        int count = 1;
        int top = 0,left = 0,bottom = n -1,right = n - 1;
        while(top <= bottom && left <= right){
            for(int i = left ; i <= right ; i++){
                num[top][i] = count++;
            }
            top++;
            for(int i = top ; i <= bottom; i++){
                num[i][right] = count++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i --){
                    num[bottom][i] = count++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i --){
                    num[i][left] = count++;
                }
                left++;
            }
        }
        return num;
    }
    
    public static void main(String[] args) {

        int n = 3;
        int [] [] arr = generateMatrix(n);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }
        
    }
}
