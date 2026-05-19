import java.util.Scanner;
public class TaskThree{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");   
    int numberOne = input.nextInt();
    
    System.out.print("Enter second number: "); 
    int numberTwo = input.nextInt(); 
    int sum = numberOne + numberTwo;
    System.out.printf("Sum: %d%n", sum);   
    }
}
