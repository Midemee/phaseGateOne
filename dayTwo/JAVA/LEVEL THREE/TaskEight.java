import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int total = 0;
    System.out.print("Enter a number: ");
    int number = input.nextInt();  
    
    while(number != 0) {
    total += number;
    
    System.out.print("Enter a number: ");
    number = input.nextInt(); 
    }     
    
    System.out.printf("Total: %d%n", total);
    }
}
