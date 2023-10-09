package Functions;

public class Func_Overloading {
    public static int sum(int a , int b){
       int num1 = a;
       int num2 = b;
       return num1 + num2;
    }
    public static int sum(int a , int b, int c){
        int num1 = a;
        int num2 = b; 
        int num3 = c;
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(5, 4));
    }
}
