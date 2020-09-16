import java.util.Scanner;

public class GennadyandaCardGame {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
            String card = s.nextLine();
            String cardsOnHand = s.nextLine();
            boolean flag = false;
            int i = 1;
            while( i <= 13){
                if(card.charAt(1) == cardsOnHand.charAt(i) || card.charAt(0) == cardsOnHand.charAt(i-1))
                    flag= true;

                i += 3;
            }
            if(flag)
                System.out.println("YES");
            else System.out.println("NO");

    }
}
