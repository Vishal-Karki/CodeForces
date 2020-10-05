import java.util.Scanner;

public class BlackSquare {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a1 = s.nextInt(); int a2 = s.nextInt(); int a3= s.nextInt(); int a4= s.nextInt();
        s.nextLine();
        String stripNumber  = s.nextLine();
        int cal = 0;

        for(int i=0;i<stripNumber.length();i++){

            if( stripNumber.charAt(i) == '1'){
                cal += a1;
            }else if( stripNumber.charAt(i) == '2' ){
                cal +=a2;
            } else if(stripNumber.charAt(i) == '3'){
                cal += a3;
            }else if( stripNumber.charAt(i) == '4'){
                cal += a4;
            }
        }
        System.out.println(cal);
    }
}
