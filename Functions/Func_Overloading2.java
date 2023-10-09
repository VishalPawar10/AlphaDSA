package Functions;

public class Func_Overloading2 {
    public static int sum(int a , int b){
       int num1 = a;
       int num2 = b;
       return num1 + num2;
    }
    public static Float sum(Float a , Float b, Float c){
        Float num1 = a;
        Float num2 = b; 
        Float num3 = c;
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        System.out.println(sum(2.0f, 3.0f, 4.0f));
        System.out.println(sum(5, 4));
    }
}