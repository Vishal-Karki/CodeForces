import java.util.Scanner;

public class NewYearCandles {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a = s.nextInt(); int b = s.nextInt();

        int numberOfCandles = a;
        int usedCandles = 0; int hours =0;
        while (numberOfCandles > 0){

            numberOfCandles -= 1;
            usedCandles++;
            if( usedCandles == b){
                usedCandles =0;
                numberOfCandles+=1;
            }
            hours++;
        }
        System.out.println(hours);
    }
}
