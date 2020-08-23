import java.util.Scanner;

public class IIyaAndBankAccount {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int amount = s.nextInt();
         int a = amount/10;
         int b =  amount%10;
         b = b + (amount/100)*10;

        if(amount >=0)
            System.out.println(amount);
        else {
            System.out.println( Math.max(a, b) );
        }
    }
}
