import java.util.Scanner;

public class TeamOlympiad {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        int[] one = new int[5000];
        int[] two = new int[5000];
        int[] three = new int[5000];
        int x=0,y=0,z=0;

        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();


        for(int i=0;i<size;i++){
            if(arr[i] == 1){
                one[x] = i+1;
                x++;}
            if(arr[i] == 2){
                two[y] = i+1;
                y++;}
            if(arr[i]==3){
                three[z]=i+1;
                z++;}
        }


        int teams = Math.min(x,Math.min(y,z));
        System.out.println(teams);
        for(int i=0;i<teams;i++){
            System.out.println(one[i]+" "+two[i]+" "+three[i]);
        }

        }
    }

