;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
       
        int[] arr = new int[9];
        int max = 0; //최대값
        int order = 0; //순서
        for(int i =0; i<9; i++)
        {
            arr[i] = scan.nextInt();
        }

        max = arr[0];
        for(int i = 0; i<9; i++)
        {

            if(max < arr[i])
            {
                max = arr[i];
                order = i;
            }

        }
        System.out.println(max);
        System.out.println(order + 1);

    }

}
