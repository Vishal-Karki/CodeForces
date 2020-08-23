import java.util.Scanner;

public class nearlyLuckyNumber {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int count=0;
       String number = s.nextLine();
        char[] check = number.toCharArray();
        boolean flag = false;

        for(int i=0;i<number.length();i++){
            if( luckynumber(check[i]-48) ){
                count++;
            }
        }
        if(luckynumber(count))
            System.out.println("YES");
        else
            System.out.println("NO");
       }
       private  static boolean luckynumber(int n){
        if(n==0)
            return false;
        if(n==4 || n==7)
            return  true;

        while (n > 0){
            if(n%10 != 4 || n%10 != 7)
                return false;
        }
        return true;
       }

    }

