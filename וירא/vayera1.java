import java.util.Scanner;

public class vayera1 {
    public static void input (){
        Scanner sc=new Scanner(System.in);
        System.out.println("input a number and 2 chars");
        int a=sc.nextInt();
       char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
printLine(a,c1);
print1(a,c1,c2);
printLine(a,c1);
    }

    public static void printLine(int n,char a){
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
        }
        System.out.println();
    }
    public static void print1(int n,char a,char b){
        for (int i = 1; i <= n-2; i++) {
            System.out.print(a);
            for (int j = 1; j <=n-2 ; j++) {
                System.out.print(b);
            }
            System.out.print(a);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        input();
    }
}
