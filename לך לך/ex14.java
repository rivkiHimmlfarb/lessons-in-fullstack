import java.util.Scanner;

public class ex14 {
    public static boolean valid(int n){
        return (n>0&&n%2==1)?true:false;
    }
    public static void printSpace(int n){
        for(int i=0;i<n;i++){
            System.out.print(" ");
        }
    }
    public static void printStar(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }

    public static void printLine (int x){
        int j=1,i=x;

        while (j<=x&&i>0)
        {
       // for (int i = x; i >0 ; i-=2) {

printSpace(i/2);
           // for (int j=1;j<=x;j+=2) {
            printStar(j);

            System.out.println();
j+=2;
        i-=2;
    }
    }
    public static void main(String[] args) {
        int n=10;
Scanner in=new Scanner(System.in);
do {

    System.out.println("Enter number:");
  n=in.nextInt();
}while (valid(n)==false);
    printLine(n);
    }
}
