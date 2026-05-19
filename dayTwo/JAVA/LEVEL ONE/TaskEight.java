import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");   
    int number = input.nextInt();
    
    int square = number * number;
    System.out.printf("Square of %d is : %d%n", number, square);   
    }
}


