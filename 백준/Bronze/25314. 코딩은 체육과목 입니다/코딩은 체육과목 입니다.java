
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int div = cnt / 4;

        for(int i =0;i<div; i++)
        {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
