import java.util.Scanner;

public class hulk {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        String hate = "I hate";
        String love = "I love";
        for(int i =1 ; i<= n;i++){
            if( i == n && i%2 != 0)
                System.out.print(hate + " it ");
            else if( i == n && i%2 == 0)
                System.out.print(love + " it ");
            else if(i % 2 != 0)
            System.out.print(hate +" that ");
            else System.out.print(love + " that ");

        }
    }
}
