import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int ans = Math.abs(a - b);
            if (ans % 10 == 0) {
                System.out.println((ans / 10));
            } else System.out.println((ans / 10 + 1));
        }
    }
}

