import java.util.Scanner;

public class QueueSchool {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int children = s.nextInt();
        int rotation = s.nextInt();
        s.nextLine();
        String queue = s.nextLine();
        queue.length();
        char temp ;
        char[] ans = queue.toCharArray();

        for(int j=0;j<rotation;j++) {
            for (int i = 0; i < queue.length() - 1; i++) {
                if (ans[i] < ans[i + 1]) {
                    temp = ans[i];
                    ans[i] = ans[i + 1];
                    ans[i + 1] = temp;
                    i++;
                }
            }
        }
        System.out.println("ans below");
        for (char c : ans) {
            System.out.print(c);
        }
    }
}
