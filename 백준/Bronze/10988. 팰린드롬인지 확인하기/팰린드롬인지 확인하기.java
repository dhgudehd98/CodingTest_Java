

import java.beans.beancontext.BeanContext;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.print.attribute.standard.MediaSizeName.B;

/**
 *
 * 팰리드롬
 * - 영문자의 앞뒤가 똑같은지 확인하는 문제
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        StringBuilder strbuilder= new StringBuilder(str1);
        String str2 = strbuilder.reverse().toString();
        boolean b = true;
        int i = 0;
        while(i<str1.length())
        {
            if(str1.charAt(i) != str2.charAt(i)){
                b = false;
                break;
            }
            i++;
        }
        System.out.println(b == true ? 1 : 0);
    }
}