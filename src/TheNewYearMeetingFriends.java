import java.util.Scanner;

public class TheNewYearMeetingFriends {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
         int a = s.nextInt(); int b = s.nextInt(); int c = s.nextInt();

        int Minor3 = Math.min(a,Math.min(b,c));
        int Major3 = Math.max(a,Math.max(b,c));

        int min = Integer.MAX_VALUE;

        for(int i=Minor3 ; i<=Major3 ; i++){
            int dis = Math.abs(a - i) + Math.abs(b - i) + Math.abs(c - i);
            if( min > dis)
                min = dis;
        }
        System.out.println(min);
    }
}
