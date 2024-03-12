

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Long totalPrice = scan.nextLong();
        int cnt = scan.nextInt();
        int itemPrice ;
        int itemCnt;
        int sum =0;

        for(int i = 0; i<cnt; i++)
        {
            itemPrice = scan.nextInt();
            itemCnt = scan.nextInt();
            sum += itemPrice * itemCnt;

        }

        if(sum == totalPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}
