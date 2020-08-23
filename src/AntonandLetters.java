import java.util.Scanner;

public class AntonandLetters {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine();

        int[] arr = new int[26];
        for(int i=1;i<input.length()-1;i++){
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
                arr[ input.charAt(i) - 'a']++;
            }
        }
        int count =0;
        for(int i=0;i<26;i++)
           if(arr[i] > 0)
               count++;
        System.out.println(count);
    }
}
