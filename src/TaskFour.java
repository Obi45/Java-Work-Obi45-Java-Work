import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int gradeCounter = 1;
        for(int count = 1; count <= 10; count+= 2){

            System.out.println("Enter scores:");
            int score = input.nextInt();

            sum += score;
            gradeCounter++;

        }
        System.out.println("the sum of the even is:" + sum);

    }
}
