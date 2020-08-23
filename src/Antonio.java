import java.util.Scanner;

public class Antonio {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        s.nextLine();
        String games = s.nextLine();
        wins(games);
    }
    public static   void  wins(String games){
        int A=0,D=0;
        for(int i=0;i<games.length();i++){
            if(games.charAt(i) == 'A')
                A++;
            else
                D++;
            if( A > games.length()/2)
              {
                  System.out.println("Anton"); return;
              }
            if(D > games.length()/2)
                {System.out.println("Danik");
                return;}
        }
        if(A > D)
            System.out.println("Anton");
        else if( D > A)
            System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
