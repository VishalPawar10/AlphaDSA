package Patterns;

public class Patterns {

    public static void char_Pattern(int n){
        char ch = 'A';
        for(int i= 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void half_Pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }


            System.out.println();
        }
    }

    public static void inverted_star(int n){
        for(int i=1; i<=n; i++){
            for(int j= 1; j<=n-i+1; j++){
            System.out.print("*");

            }
            System.out.println("");
        }
    }

    public static void starPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j= 1; j<=i; j++){
            System.out.print("*");

            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
       //starPattern(5);
       //inverted_star(5);
       //half_Pyramid(5);
       char_Pattern(5);
    }
}
