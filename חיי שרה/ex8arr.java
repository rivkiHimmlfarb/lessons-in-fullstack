import java.util.Scanner;

public class ex8arr {
    public static void main(String[] args) {
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int month,day;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("input months");
            month = sc.nextInt();
            System.out.println("input day");
            day = sc.nextInt();
        }while (!(month>=1&&month<=12&&day>=1&&day<=days[month]));
        int sum=0;
        for (int i =0; i < month-1; i++) {
          sum+=days[i];
        }
        sum+=day;
        System.out.println("sum="+sum);
    }
}
