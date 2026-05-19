import java.util.Scanner;
public class TaskSix{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter width number: ");   
    int width = input.nextInt();
    
    System.out.print("Enter length number: "); 
    int length = input.nextInt(); 
    int area = width * length;
    System.out.printf("Area: %d%n", area);   
    }
}
