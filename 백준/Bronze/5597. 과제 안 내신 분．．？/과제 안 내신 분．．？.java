

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[31]; // 0 - 30
        int num = 0;
        for(int i =1; i<=28;i++) // 1 -28
        {
            num = scan.nextInt();
            arr[num] = num;
        }
        for(int i = 1; i<=30; i++)
        {
            if(arr[i] == 0)
            {
                System.out.println(i);
            }
        }


    }
}