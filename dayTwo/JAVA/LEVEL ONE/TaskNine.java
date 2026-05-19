import java.util.Scanner;
public class TaskNine{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the price of item: ");   
    double price = input.nextDouble();
    
    double discount = price * (10.0 / 100.0);
    double discountedPrice = price - discount;
    System.out.printf("Discount: %.2f%nPrice after discount: %.2f%n", discount, discountedPrice);   
    }
}
