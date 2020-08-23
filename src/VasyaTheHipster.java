import java.util.Scanner;

public class VasyaTheHipster {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a = s.nextInt(); int b = s.nextInt();
        int ans = Math.min(a,b);
        int ans2 = (Math.max(a,b) - ans) / 2;
        System.out.println(ans+" "+ans2);
    }
}
