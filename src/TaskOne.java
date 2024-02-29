import java.util.Scanner;

public class TaskOne {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers:");
        int sum = 0;

        for(int count = 1; count <= 10; count++){
            int number = input.nextInt();
            sum += number;
            count++;

        }
        System.out.println(sum);
    }
}
