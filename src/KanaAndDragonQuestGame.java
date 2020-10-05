import java.util.Scanner;

public class KanaAndDragonQuestGame {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int x = s.nextInt(); int n = s.nextInt(); int m = s.nextInt();
            boolean flag = false;

            while( n > 0){
                x = x/2 +10 ;
                if(x<=0){
                    flag = true;
                    break;
                }
                n--;
            }


            while(m > 0){
                x -= 10;
                if(x<=0){
                    flag = true;
                    break;
                }
                m--;
            }

            if(flag){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
