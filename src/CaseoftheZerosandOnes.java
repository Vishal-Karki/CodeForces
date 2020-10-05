import java.util.Scanner;

public class CaseoftheZerosandOnes {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int len = s.nextInt();
        String str = s.next();
        StringBuilder input = new StringBuilder(str);

        for(int i =0 ; i<input.length() -1  ; i++ ){

            if( input.charAt(i) != input.charAt(i+1)){
           //     System.out.println(i+" "+(i+1));
                input.deleteCharAt(i+1);
                input.deleteCharAt(i);
                i-- ;
            }

        }
        if(input.length()==2){
            if(input.charAt(0) != input.charAt(1)){
                System.out.println(0);
            }else System.out.println(2);
        }else System.out.println(input.length());

    }
}
