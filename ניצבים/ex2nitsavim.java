import java.util.Scanner;

public class ex2nitsavim {
    //תרגול לולאות-2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 501; i++) {
            if ((i / 100) * (i / 100) * (i / 100) + (i % 10) * (i % 10) * (i % 10) + ((i / 10) % 10) * ((i / 10) % 10) * ((i / 10) % 10) == i)
                System.out.print(i + ", ");
        }
    }
}