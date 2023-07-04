package Assignment_5;

public class convert1DArrayInto2DArray {

    static int[][] construct2DArray(int[] original, int m, int n) {

        int [][] arr=new int [m][n];
        if(original.length!=m*n)return new int[0][0];
        int ix=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=original[ix++];
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int [] original = {1,2,3,4};
        int m = 2, n = 2;
        
        int [] [] arr = construct2DArray(original, m, n);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }
    }
}
