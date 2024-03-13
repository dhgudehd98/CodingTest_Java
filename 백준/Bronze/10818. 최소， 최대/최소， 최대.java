import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int[] arr = new int[count];
        int max;
        int min;
        
        for(int i = 0; i<count; i++)
        {
            arr[i] = scan.nextInt();
        }

        max = arr[0];
        min = arr[0];
        for(int i = 1; i<count; i++)
        {
            if(max < arr[i])  max = arr[i];
            if(min > arr[i])  min = arr[i];

        }
        System.out.println(min + " " + max);

    }

}
