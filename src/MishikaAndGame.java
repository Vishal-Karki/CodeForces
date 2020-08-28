import java.util.Scanner;

public class MishikaAndGame {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        int WinsA=0,WinsB=0;
        for(int z=0;z<T;z++){
            int a = s.nextInt(); int b = s.nextInt();
            if( a > b)
                WinsA++;
            else if(b > a)
                WinsB++;
        }
        if( WinsA > WinsB)
            System.out.println("Mishka");
        else if(WinsA < WinsB)
            System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
