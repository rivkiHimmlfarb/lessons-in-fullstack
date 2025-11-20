import java.util.Scanner;

public class ex1_2 {
    public static void price(int days, int service, int numOfRoom)
    {
        int price = 500*days+service;
        System.out.println("num of room: "+numOfRoom);
        System.out.println(" the price is: "+price+ " shekels");
        System.out.println(" you was "+days+" days in the hotel");
    }
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_Of_Room=0;
        while (num_Of_Room!=999) {
            System.out.println();
            System.out.println("insert number of days, sum of service and num of room ");
            int days = in.nextInt();
            int sum_service = in.nextInt();
             num_Of_Room= in.nextInt();
            price(days,sum_service,num_Of_Room);
        }


    }
}
