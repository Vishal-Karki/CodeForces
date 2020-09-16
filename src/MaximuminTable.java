import java.util.Scanner;

public class MaximuminTable {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++) {
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        System.out.println(arr[n-1][n-1]);
    }
}
