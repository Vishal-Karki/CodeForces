import java.util.Scanner;
public class Magnets{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int  n = s.nextInt(); s.nextLine();
        int count= 0; int a = 200;
        for(int i=0;i<n;i++){
           int b = s.nextInt();
           if( a != b){
               count++;
               System.out.println("HERE");}
           a = b;
        }
        System.out.print(count);
    }
}
