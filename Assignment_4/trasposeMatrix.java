package Assignment_4;

public class trasposeMatrix {
    
    static int[][] transpose(int[][] A) {

        int N = A.length;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        transpose(matrix);
        
        System.out.print("Modified matrix is \n");
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
        
    }
}
