import java.util.Scanner;

public class IloveUsername {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();

        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < T; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
            if (arr[i] < min) {
                min = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
