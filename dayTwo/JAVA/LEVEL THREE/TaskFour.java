import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
        for (int index = 1; index <= 12; index++){
        int multiply = number * index;
        System.out.println(number + "x" + index + "=" + multiply);
        }
    }
}
