package Functions;

public class BinomialCoff {

    public static int BinCoff( int n ,int r){
        int Coff_n = fact(n);
        int Coff_r = fact(r);
        int Coff_nmr = fact(n-r);
        int BinCoff = Coff_n/(Coff_r-Coff_nmr);
        return  BinCoff;
    }

    public static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
       return f;
    }
    public static void main(String[] args) {
        System.out.println(BinCoff(1, 2));
    }
}
