import java.util.Scanner;

public class VanyaandCubes {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int cubesTillThatRow = 0; int a = 0;
        int sum =0;
        int lvl=0;
        while(cubesTillThatRow <= n){
            lvl++;
            a = a+lvl;
            cubesTillThatRow += a ;

        }
        System.out.println(lvl-1);

    }
}
