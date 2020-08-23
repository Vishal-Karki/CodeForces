import java.util.Scanner;

public class Buyshovel {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int k = s.nextInt();
        int r = s.nextInt();
        int price = k;
        int shovel = 1;

        while(true){

            if( r == (price%10) || (price%10)==0 ){
                System.out.println(shovel); break;
            }
            price += k;
            shovel++;
        }
    }

}
