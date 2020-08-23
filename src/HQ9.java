import java.util.Scanner;
public class HQ9{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        String lang = s.nextLine();
        char[] p = lang.toCharArray();
        boolean flag = false;
        for (char c : p) {

            if (c == 'H' || c == 'Q' || c == '9') {
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}