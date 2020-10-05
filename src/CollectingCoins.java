import java.util.Scanner;

public class CollectingCoins {
    private  static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int i=0;i<T;i++){
            int a = s.nextInt(); int b = s.nextInt(); int c = s.nextInt(); int n = s.nextInt();
            int max = Math.max(a,Math.max(b,c));
            int req = n - ( max - a);
            req = req - ( max - b);
            req = req - (max -c);
            if(req%3 == 0 && req>=0){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
