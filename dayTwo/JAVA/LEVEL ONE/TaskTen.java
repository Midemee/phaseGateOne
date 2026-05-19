import java.util.Scanner;
public class TaskTen{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");   
    double numberOne = input.nextDouble();
    
    System.out.print("Enter second number: "); 
    double numberTwo = input.nextDouble();

    System.out.print("Enter third number: "); 
    double numberThree = input.nextDouble();    
     
    double average = (numberOne + numberTwo + numberThree) / 3;
    System.out.printf("Average: %.2f%n", average);   
    }
}
