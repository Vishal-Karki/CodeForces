import java.util.Scanner;

public class candies {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int i=0;i<T;i++){
            int n=s.nextInt(); int day =2; int sum=1;
            while( true ){
                sum += (int) Math.pow(2,day-1);

                if( n % sum == 0 ){
                    break;
                }
                day++;

            }

            System.out.println( (n/sum) );

        }
    }
}
