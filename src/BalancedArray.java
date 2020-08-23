import java.util.Scanner;

public class BalancedArray {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];//{2, 4, 1, 5};
            if (n % 4 != 0)
                System.out.println("NO");
            else {
                System.out.println("YES");
                arr[0] = 2;
                arr[1] = 4;
                System.out.print(2 + " " + 4 + " ");
                for (int j = 2; j <= (n / 2) - 1; j++) {
                    System.out.print( (arr[j - 2] + 6) + " ");
                }

                arr[(n / 2)] = 1;
                arr[(n / 2) + 1] = 5;
                System.out.print(1 + " " + 5 + " ");
                for (int j = (n / 2) + 2; j < n; j++) {
                    System.out.print( (arr[j-2] + 6) + " ");
                }
                System.out.println();
            }
        }
    }
}