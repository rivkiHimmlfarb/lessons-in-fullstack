import java.util.Scanner;

public class ex14toldot {
    public static void main(String[] args) {
        int t[]= new  int[10];
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("input 10 numbers");
        for (int i = 0; i < t.length; i++) {
            t[i]=sc.nextInt();
        }
        for (int i = 0; i < t.length; i++) {
            if (!(t[i]==t[t.length-i-1]))
                flag=false;
        }
        System.out.println(flag);

    }
}
