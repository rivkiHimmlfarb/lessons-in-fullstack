import java.util.Scanner;

public class VAYERA4 {
public static int retsef (){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a letter");
    char c2='0';
    int count=0;
    while (c2!='.') {
        c2 = sc.next().charAt(0);
    count++;
    }
    return count;
}

    public static void main(String[] args) {

        System.out.println(retsef());
    }

}
