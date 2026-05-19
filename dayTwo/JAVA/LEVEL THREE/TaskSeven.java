import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int sum = 0;
        for (int index = 1; index <= 5; index++){
            System.out.print("Enter a number: ");
            int number = input.nextInt();        
            sum += number;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
