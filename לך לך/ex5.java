public class ex5 {
    public static boolean f(int n){
        return n/10-2==n%10;
    }

    public static void main(String[] args) {
        int x=75;
        System.out.println(f(x));
    }
}
