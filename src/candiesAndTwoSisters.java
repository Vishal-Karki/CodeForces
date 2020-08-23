import java.util.Scanner;

public class candiesAndTwoSisters {
    private static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        int T= s.nextInt(); int n; int a,b; int count;
        for(int i=0;i<T;i++){
            n = s.nextInt();
            if( n %2 ==0)
                b= (n/2) -1;
            else b = n / 2;

            a = n - b;
            if( n == 0  || n==1 || n==2)
                count = 0;
            else count = n-a;
            System.out.println(count);
        }
    }
}
