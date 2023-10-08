package Variables;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int Area = 0;
        Area = a*a;
        System.out.println("Area of Square is :"+Area);
    }
}
