import java.util.Scanner;

public class ConstructTheSubString {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for (int z = 0; z < T; z++) {
            int n = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            StringBuilder s = new StringBuilder();
            String choose = "abcdefghijklmnopqrstuvwxyz";
            char[] alphabhets = choose.toCharArray();


            for (int j = 0; j < b; j++) {
                if( j >= c){
                    s.append(alphabhets[0]);
                }else
                s.append(alphabhets[j]);

            }
            for(int i=0;i<n-b;i++){
                s.append(s.charAt(i));
            }

            System.out.println(s);


        }
    }
}
