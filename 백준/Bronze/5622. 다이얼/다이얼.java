import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.print.attribute.standard.MediaSizeName.B;

/**
 * A - Z : 25 abc/def/ghi/jkl/mno/pqrs/tuv/wxyz
 * 숫자  : 2-9 : 8개
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int totalTime = 0;
        char ch ;
        for(int i = 0; i< str.length(); i++)
        {
            ch = str.charAt(i);
           // A - Z : 25 abc/def/ghi/jkl/mno/pqrs/tuv/wxyz
            switch (ch)
            {
                case 'A': case 'B': case 'C':
                    totalTime +=3;
                    break;
                case 'D': case 'E': case 'F':
                    totalTime +=4;
                    break;
               case 'G': case 'H': case 'I':
                    totalTime +=5;
                    break;
                case 'J': case 'K': case 'L':
                    totalTime +=6;
                    break;
               case 'M': case 'N': case 'O':
                    totalTime +=7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    totalTime +=8;
                    break;
               case 'T': case 'U': case 'V':
                    totalTime +=9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    totalTime +=10;
                    break;
                default :
                    break;


            }
        }
        System.out.println(totalTime);



    }
}