import java.util.Scanner;

public class AddOddorSubtractEven {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int i=0;i<T;i++){
            int a = s.nextInt(); int b = s.nextInt();
            int diff = a-b;
            if(diff == 0){
                System.out.println(0);
            }
            else if (diff < 0 ){
                if(diff%2 == 0)
                System.out.println(2);
                else
                    System.out.println(1);
            } else if(diff > 0){
                if(diff%2 == 0)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
        }
    }
}
