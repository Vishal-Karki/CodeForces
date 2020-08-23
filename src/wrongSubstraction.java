import java.util.Scanner;

public class wrongSubstraction {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int number = s.nextInt();
        int count = s.nextInt();
        while(count > 0){
            if(number%10 == 0)
                number = number/10;
            else
                number = number -1;
            count--;
        }
        System.out.println(number);
    }
}
