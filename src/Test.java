public class Test {
    public static void main(String[] args) {

        System.out.println(GCD(36,24));
    }

    static int GCD(int a, int b){
        int Max = Math.max(a,b);
        int Min = Math.min(a,b);
        int gcd=1;
        for(int i=1;i<=Min;i++){
            if(a%i == 0 && b%i ==0){
                gcd = i;
            }
        }
        return gcd;
    }


}
