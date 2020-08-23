import java.util.Scanner;

public class bigBear {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a= s.nextInt();
        int b= s.nextInt();
        int count = 0;
        while(true){
            count++;
            a = a*3;
            b = b*2;
            if(a > b){
                break;
            }
        }
        System.out.println(count);
    }
}
