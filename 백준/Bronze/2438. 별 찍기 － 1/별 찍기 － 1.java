
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String star = "";
        for(int i = 0; i<a; i++){
            star += "*";
            System.out.println(star);
        }
    }

}
