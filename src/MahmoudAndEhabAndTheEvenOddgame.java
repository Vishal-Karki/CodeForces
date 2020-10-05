import java.util.Scanner;

public class MahmoudAndEhabAndTheEvenOddgame {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        if(n%2 == 0){
            System.out.println("Mahmoud");
        }else
            System.out.println("Ehab");
    }
}
