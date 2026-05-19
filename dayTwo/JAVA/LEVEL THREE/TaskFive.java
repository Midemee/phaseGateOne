import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int factorial = 1;
        for (int index = 1; index <= number; index++){
        factorial *= index;
        }
        System.out.printf("Factorial of %d is %d%n", number, factorial);
    }
}
