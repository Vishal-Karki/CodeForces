import java.util.Arrays;
import java.util.Scanner;

public class HolidayOfEquality {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int population = s.nextInt();
        int[] wealth = new int[population];
        for(int i=0;i<population;i++){
            wealth[i] = s.nextInt();
        }
        int expense  = 0;
        Arrays.sort(wealth);
        int max = wealth[population - 1];
        for(int i=0;i<population -1;i++){
            expense += max - wealth[i];
        }
        System.out.println(expense);
    }
}
