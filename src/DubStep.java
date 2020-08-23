import java.util.Scanner;

public class DubStep {
    private static Scanner s= new Scanner(System.in);
    public static void main(String[] args) {
        String input = s.nextLine();
        boolean flag = false;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='W' && input.charAt(i+1)=='U' && input.charAt(i+2)=='B'  ){
                   if(flag){
                       System.out.print(" ");
                       flag = false;
                   }
                   i+=2;
            }
            else{ flag= true;
                System.out.print(input.charAt(i));}
        }
    }
}
