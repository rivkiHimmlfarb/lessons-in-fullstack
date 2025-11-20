import java.util.Scanner;

public class ex6arr {
    public static void main(String[] args) {
int []arr=new int[5];
boolean y=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int) (Math.random()*70+30);
            System.out.println(arr[i]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("input number");
        int n=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                y=true;
                System.out.println(i+1);
            }
        }
        System.out.println(y);
    }
}
