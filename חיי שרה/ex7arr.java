import java.util.Scanner;

public class ex7arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE,count=1;
        System.out.println("input 10 numbers");
        int []n=new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i]=sc.nextInt();
            if (n[i]>max) max=n[i];
            else if (n[i]==max) count++;
        }
        System.out.println("max="+max);
        System.out.println("count="+count);
    }
}
