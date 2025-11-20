import java.util.Scanner;

public class ex3nitsavim {
    public static void main(String[] args) {
    System.out.println("enter a natural number");
    Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
        int devide1=0;
        int devide2=0;
        int tnaiLididut=0;
        for (int i = 1; i < num1; i++) {
            if (num1%i==0)
                devide1+=i;
        }
        if (devide1==num2)
            tnaiLididut++;
            for (int i = 1; i <num2; i++) {
                if (num2%i==0)
                    devide2+=i;
            }
        if (devide2==num1)
            tnaiLididut++;
        if (tnaiLididut==2)
            System.out.println("המספרים הללו ידידים");
        else System.out.println("המספרים אינם ידידים:(");
    }
}
