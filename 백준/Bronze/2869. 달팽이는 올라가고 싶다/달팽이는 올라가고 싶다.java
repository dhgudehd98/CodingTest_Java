

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 낮에 A미터 동안 이동
        int B = scanner.nextInt(); // 밤에 B미터 동안 감소
        int V = scanner.nextInt(); //


        int day = (V - B-1) / (A - B) + 1;
        System.out.println(day);
        
        
        //달팽이가 하루에 올라가는 높이 : A - B

//        while(height < V)
//        {
//            height += A; //하루 지났을때의 높이
//            if(height == V){ //미끄러지지만 않은거지 하루가 지난거임
//                day++;
//                break;
//            }
//            height -= B;
//            day ++;
//
//        }
//        System.out.println(day);


    }
}

