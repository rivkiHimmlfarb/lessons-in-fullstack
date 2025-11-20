import java.util.Scanner;

public class ex16toldotFixed {
    public static void main(String[] args) {
        int t[]=new int[10];
        int temp,i=0;
        int a=0;
        Scanner sc = new Scanner(System.in);
        while (i < t.length) {

       temp=sc.nextInt();
       if (temp>0) {
           t[a]=temp;
          a++;
       }
       else t[i]=t[i+1];
            i++;
        }
        for (int j=0;j<t.length;j++){
            System.out.println(t[j]);
        }
    }
}
