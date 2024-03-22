import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        double totalScore = 0; // 학점의 총합

        String[] name = new String[20];
        double[] score = new double[20];
        String[] grade = new String[20];

        double gradeScore = 0;
        for(int i = 0; i<20; i++)
        {
            name[i] = sc.next();
            score[i]  = sc.nextDouble();
            grade[i] = sc.next();
            double subGrade = 0; // 과목 평점
            switch(grade[i])
            {
                case "A+":
                    subGrade = 4.5;
                    break;
                case "A0":
                    subGrade = 4.0;
                    break;
                case "B+":
                    subGrade = 3.5;
                    break;
                case "B0":
                    subGrade = 3.0;
                    break;
                case "C+":
                    subGrade = 2.5;
                    break;
                case "C0":
                    subGrade = 2.0;
                    break;
                case "D+":
                    subGrade = 1.5;
                    break;
                case "D0":
                    subGrade = 1.0;
                    break;
                case "F":
                    subGrade = 0.0;
                    break;
                case "P":
                   continue;
            }

            totalScore += score[i];
            result +=  subGrade * score[i];
        }

        System.out.printf("%.6f", result / totalScore);


    }

}

