import java.util.Scanner;

public class VasayaAndSocks {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); int m = s.nextInt();
        int day = 0;
        while (true){
            day++;
            if( n <= 0)
                break;
            n -= 1;
            if( day % m == 0)
                n += 1;

        }
        System.out.println(day -1);
    }
}
