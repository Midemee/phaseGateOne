import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");   
    int numberOne = input.nextInt();
    
    System.out.print("Enter second number: "); 
    int numberTwo = input.nextInt(); 
    int product = numberOne * numberTwo;
    System.out.printf("Product: %d%n", product);   
    }
}
