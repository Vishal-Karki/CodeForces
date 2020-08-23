import java.util.Scanner;

public class capslock {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine();
        boolean flag = false;
        for(int i=1;i<input.length();i++) {
            if (input.charAt(i) >= 'a'){
                flag = true;break;
             }
        }
        if(!flag)
        { StringBuilder ans = new StringBuilder();
            for(int i=0;i<input.length();i++)
                if(input.charAt(i) >= 'a')
                    ans.append((char) (input.charAt(i) - 32));
                else
                    ans.append((char) (input.charAt(i) + 32));

            System.out.println(ans);
        }else System.out.println(input);
    }
}
