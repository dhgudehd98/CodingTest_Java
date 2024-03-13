
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


//입력하다가 0이 되면 종료

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a ;
        int b;
        while(scan.hasNextInt())
        {
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a + b);


        }
    }

}
