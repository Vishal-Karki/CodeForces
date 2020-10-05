import java.util.Scanner;

public class AandBandCompilationErrors {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        int a=0,b=0;
       int input;
        for(int i=0;i<n;i++){
            input = s.nextInt();
            a += input;
        }
        for(int i=0;i<n-1;i++){
            input = s.nextInt();
            b += input;
        }
        System.out.println(a-b);
        a = 0;
        for(int i=0;i<n-2;i++){
            input = s.nextInt();
            a+=input;
        }
        System.out.println(b-a);

    }
}
