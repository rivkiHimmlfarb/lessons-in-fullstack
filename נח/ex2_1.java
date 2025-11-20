
import java.util.Scanner;
public class ex2_1 {

    public static void sum (int a, int b){

        System.out.println(a+b+" חיבור ");

    } public static void chisur (int a, int b){
        System.out.println(a-b+" חיסור ");
    }
    public static void kefel (int a, int b){
        System.out.println(a*b+" כפל ");
    }
    public static void chiluk (int a, int b){
            System.out.println((double)a/b+" חילוק ");

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int b=0;
        while (b==0) {
            System.out.println("insert 2 numbers");
            int a = in.nextInt();
            b = in.nextInt();
            sum(a, b);
            chisur(a, b);
            kefel(a, b);
            chiluk(a, b);
        }
    }
}

