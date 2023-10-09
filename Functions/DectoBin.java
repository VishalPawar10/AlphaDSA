package Functions;

public class DectoBin {

    public static void decToBin(int n){
        int my_num = n;
        int bin_no = 0;
        int pow=0;
        
        while(n > 0){
            int rem= n % 2;
            bin_no = bin_no + (rem* (int)Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.println("The binary of "+my_num+": "+bin_no);
    }


    public static void main(String[] args) {
        decToBin(5);
    }
}
