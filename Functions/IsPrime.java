package Functions;

public class IsPrime {
    public static boolean Prime(int n){
        boolean Prime = true;

        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                Prime = false;
                break;
            }
        }
    return Prime;
    }
    public static void main(String[] args) {
        System.out.println(Prime(7));
    }
}
