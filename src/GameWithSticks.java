import java.util.Scanner;

public class GameWithSticks {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
     int n = s.nextInt(); int m = s.nextInt();
     n = Math.min(n,m);
     if( n % 2 == 0)
         System.out.println("Malvika");
     else System.out.print("Akshat");

    }
}
