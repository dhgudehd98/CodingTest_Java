
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 바구니 갯 1~N번까지 있음. 5 (1,1)(2,2)
        int M = scan.nextInt(); // 공을 바꾸는 횟수

        int k;
        int j;
        int[] arr = new int[N+1]; // arr 0 - 5까지  바구니 6번까지 존재

        for(int i = 1; i<=N; i++)
        {
            arr[i] = i; //1 = 1= 2=2 3=3 4=4 5=5 arr[0] = null
        }

        for(int i = 1; i<=M; i++)
        {
            int change = 0;
            k = scan.nextInt();
            j = scan.nextInt();

            change = arr[k];
            arr[k] = arr[j];
            arr[j] = change;
        }
        for(int i = 1; i<=N; i++)
        {
            System.out.println(arr[i]);
        }

    }
}