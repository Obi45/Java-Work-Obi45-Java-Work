package fireDrillOne;

import java.util.Scanner;

public class NewTaskOne {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        for(int count = 1; count <= 10; count++){
            System.out.println("Enter number:");
             number = input.nextInt();
            sum += number;
            count++;
        }
        System.out.println(sum);
    }
}
