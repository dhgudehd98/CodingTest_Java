

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int N;

        while(true)
        {
            int sum = 0;
            N = scanner.nextInt();
            if(N == -1) break;
            arr = new int[N];
            for(int i = 1; i<N; i++){
                //약수 구한 후 약수들 arr배열에 저장해놓기
                if(N % i == 0){
                    sum += i;
                    arr[i-1] = i;
                }
            }

            if(sum == N){
                System.out.print(sum + " = " + arr[0]);
                for(int x : arr){
                    if(x != 0 && x != 1){
                        System.out.print(" + " + x);
                    }
                }
                System.out.println();

            }
            //완전수가 아닐 경우
            else{
                System.out.println(N + " is NOT perfect.");
            }

        }


    }

}


