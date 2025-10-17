package ch13.ex3;

import java.util.Scanner;

public class StudentGradeEvaluator {
    public static void runProgram() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Student name (or 'exit' to stop): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter 3 test scores: ");
            int grade1 = input.nextInt();
            int grade2 = input.nextInt();
            int grade3 = input.nextInt();

            System.out.print("Enter attendance percentage: ");
            int attendance = input.nextInt();


            input.nextLine();

            int average = calculateAverage(grade1, grade2, grade3);
            String grade = gradeLogic(average);
            String status = passFailLogic(attendance, average);

            System.out.printf("Average: %d  Grade: %s  -> %s%n", average, grade, status);
        }

        input.close();
    }



    public static String passFailLogic(int attendance, int average){
        if(attendance >= 75 && average >= 70){
            return "Pass";
        } else if(attendance < 70 && average >=50){
            return "Re-Exam";
        }
        else return "Fail";
    }

    public static int calculateAverage(int a, int b, int c){
        int sum = (a+b+c)/3;
        return sum;
    }
    public static String gradeLogic(int average){
        String grade;
        return grade = switch((int) average/10){
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }


    public static void main(String[] args) {
        runProgram();
    }
}
