

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int T = Integer.parseInt(bf.readLine());

       StringTokenizer str;
       for(int i = 1;i<=T; i++){
           str = new StringTokenizer(bf.readLine()," ");
           int a = Integer.parseInt(str.nextToken());
           int b = Integer.parseInt(str.nextToken());
           bw.write("Case #"+i+": "+a +" + "+ b + " = " +(a+b)+"\n");

       }
       bf.close();
       bw.flush();
       bw.close();

    }
}
