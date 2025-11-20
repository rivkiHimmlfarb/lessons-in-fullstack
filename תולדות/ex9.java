import java.util.Scanner;

public class ex9 {
  /* public static int print (int n1,int n2,int prev){
        int newNum=0;
        newNum+=prev;
        int p=1;
        for (int i = 0; i < n1; i++) {
            newNum=newNum+n2*p;
           // System.out.print(n2);
            p*=10;
        }
        return newNum;
    }*/
public static int countDigits(int n){
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,p=1,newNum=0;
        System.out.println("input 2 numbers with the same num of digits");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while (n2>0)
        {
            for (int i = 0; i < n1%10; i++) {
                newNum=newNum+(n2%10)*p;
                p*=10;
            }

            n1/=10;
            n2/=10;
            if (countDigits(newNum)>=8)
                break;
        }
        System.out.println(newNum);
    }
}
