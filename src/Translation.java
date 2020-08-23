import java.util.Scanner;

public class Translation {
    private  static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String a = s.nextLine();
        String b = s.nextLine();
        StringBuilder check = new StringBuilder();
        for(int i =a.length()-1;i>=0;i--){
            check.append(a.charAt(i));
        }
        if( b.equals(check.toString()) )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
