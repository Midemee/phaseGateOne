import java.util.Scanner;
public class TaskSix{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int sum = 0;
        for (int index = 1; index <= number; index++){
        sum += index;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
