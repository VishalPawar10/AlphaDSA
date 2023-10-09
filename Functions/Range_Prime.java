package Functions;
public class Range_Prime {

    public static void RangeInPrime(int n){
        for(int i = 2; i<=n-1; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i= 2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       RangeInPrime(4);
    }
}
