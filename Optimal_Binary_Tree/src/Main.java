public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static float min_k(float[][] A, int i, int j, int k){
        float result = Float.MAX_VALUE;
        for (k = i; k <= j; k++){
            if (A[i][k - 1] + A[k + 1][j] < result){
                result = A[i][k - 1] + A[k + 1][j];
            }
        }

        return result;
    }

    public static float optsearchtree(int n, float[] p, int[][] R){

        int i, j, k = 0, diagonal;

        float minavg;

        float[][] A = new float[n + 1][n];

        for (i = 1; i <= n; i++){

            A[i][i - 1] = 0;
            A[i][i] = p[i];
            R[i][i] = i;
            R[i][i - 1] = 0;

        }

        A[n + 1][n] = 0;
        R[n + 1][n] = 0;

        for (diagonal = 1; diagonal <= n - 1; diagonal++){

            for (i = 1; i <= n - diagonal; i++){

                j = i + diagonal;

                A[i][j] = min_k(A, i, j, k);

            }

        }

        return 0;
    }
}