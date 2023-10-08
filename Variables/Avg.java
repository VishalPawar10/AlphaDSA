package Variables;


import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int avg =0;
         avg = (a + b + c)/3;
        System.out.println("Average of three numbers is "+avg);
    }
    
}
