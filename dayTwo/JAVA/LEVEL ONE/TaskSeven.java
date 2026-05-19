import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius: ");   
    double radius = input.nextDouble();
    
    double circumference = 2 * (22.0 /7) * radius;
    System.out.printf("circumference: %.2f%n", circumference);   
    }
}


