import java.util.Scanner;

public class ParkLighting {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int i=0;i<T;i++){
            int a = s.nextInt(); int b = s.nextInt();
            int ans =  (a*b + 1)/2  ;
            System.out.println(ans);
        }
    }
}
