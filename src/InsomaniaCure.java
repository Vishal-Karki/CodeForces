import java.util.Scanner;

public class InsomaniaCure {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int k = s.nextInt(); s.nextLine();
        int l =  s.nextInt(); s.nextLine();
        int m =  s.nextInt(); s.nextLine();
        int n =  s.nextInt(); s.nextLine();
        int d = s.nextInt();
        int i =1; int count=0;
        while(i <= d){
           if( i%k ==0  ||  i%l ==0 ||  i%m ==0 ||  i%n ==0 ){
               count++;}
           i++;
        }
        System.out.println(count);
    }

}
