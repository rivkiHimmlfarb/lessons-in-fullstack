import java.util.Scanner;

public class ex4nitsavim {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter tow numbers");
        int num1= in.nextInt();
        int num2= in.nextInt();
        int mode1 = 0 , mode2=0, sofi=1, i=1;
        while (num1 >0 || num2 >0)
        {mode1=num1%10;
            mode2=num2%10;
            if (mode1>=mode2)
                sofi=(i*mode1)+sofi;
            else sofi=(mode2*i)+sofi;
            num1=num1/10;
            num2=num2/10;
            i*=10;}
        System.out.println(sofi-1);
    }
}
