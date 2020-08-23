import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    private static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        String Guest = s.nextLine();
        String Host = s.nextLine();
        String k = Guest.concat(Host);
        char[] arr = k.toCharArray();
        Arrays.sort(arr);
         boolean flag = true;
        String scramble = s.nextLine();
        char[] arr1 = scramble.toCharArray();
        Arrays.sort(arr1);
        if( arr1.length != arr.length)
            flag = false;
        else{
        for(int i=0;i<arr1.length;i++){
            if(arr[i] != arr1[i]){
                flag= false; break;
            }
        }
        }
        if(flag)
            System.out.println("YES");
        else System.out.println("NO");


    }
}
