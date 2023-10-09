package Functions;

public class BinToDec {
    public static void binToDec(int Bin_num){
        int My_no = Bin_num;
        int pow=0;
        int dec=0;
        while(Bin_num>0){
            int last_digit = Bin_num % 10;
            dec = dec + (last_digit * (int)Math.pow(2, pow));
            pow++;
            Bin_num = Bin_num/10;
            
        }
        System.out.println("The decimal no is "+My_no+": "+dec);
    }

    public static void main(String[] args) {
       binToDec(101);
    }
}
