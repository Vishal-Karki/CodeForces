import java.util.Scanner;

public class FancyFence {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int angle = s.nextInt();
            int ExteriorAngle = 180 - angle;
            if( 360 % ExteriorAngle == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");

        }
    }
}
