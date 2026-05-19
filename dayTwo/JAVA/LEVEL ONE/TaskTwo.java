import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");   
    int age = input.nextInt();
    int fiveYears = age + 5;
    System.out.printf("Your age in 5 years is %d%n", fiveYears);   
    }
}
