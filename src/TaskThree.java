import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter =1;
        for(int count = 1; count <= 10; count++){
            System.out.println("Enter scores:");
            int score = input.nextInt();
            total += score;
            gradeCounter++;
        }
        int average = total / gradeCounter;
        System.out.println("the total score is:" + total);
        System.out.println("the average of the score is:" + average);
    }
}
