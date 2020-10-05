import java.util.Scanner;

public class OlesyaandRodion {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); int t = s.nextInt();

        if( n ==1 && t == 10){
            System.out.println(-1);
        }else if(t == 10) {
            System.out.print(1);
            n=n-1;
            while(n>0){
                System.out.print(0);
                n--;
            }

        }else{
                while( n > 0){
                    System.out.print(t);
                    n--;
                }
            }
        }

    }

