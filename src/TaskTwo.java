import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter numbers:");
            int number = input.nextInt();
            total += number;
            gradeCounter++;
        }
        int average = total / gradeCounter;
        System.out.println("the average is:" + average);



        }
    }
