package Variables;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Float pencil = sc.nextFloat();
       Float pen = sc.nextFloat();
       Float eraser = sc.nextFloat();
       sc.close();

       Float Total= (pencil + pen + eraser);
       System.out.println("Total is "+Total);
    }
}
