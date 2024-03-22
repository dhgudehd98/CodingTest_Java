

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] c = new int[n][m];

        for(int i = 0 ; i< a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i< b.length; i++) {
            for(int j = 0; j<b[i].length; j++)
            {
                b[i][j] = scanner.nextInt();
            }
        }
        //
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int[] x : c){
            for(int arr : x){
                System.out.print(arr + " ");
            }
            System.out.println();
        }



    }

}

