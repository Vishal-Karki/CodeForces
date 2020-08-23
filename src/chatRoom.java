import java.util.Scanner;

public class chatRoom {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String msg = sc.nextLine(); boolean flag = false;
        String op = "hello";
        int j=0,p=0;
        for(int i=0;i<msg.length();i++){
            if(msg.charAt(i) == op.charAt(j)){
                j++;p++;
                if(p == 5){
                    flag = true; break;
                }
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
