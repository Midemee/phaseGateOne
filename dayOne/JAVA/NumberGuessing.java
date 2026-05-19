import java.util.Random;
import java.util.Scanner;
public class NumberGuessing{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random randNumber = new Random();

    int guess = randNumber.nextInt(1, 100);
    int guesses = 0;
    int choice = 0;
    
    for (int index = 1; index <= 5; index++){
    System.out.print("Enter a number (1-10): ");
    choice = input.nextInt();
    
    while (choice < 1 || choice > 100){
    System.out.print("Enter a valid number! (1-10): ");
    choice = input.nextInt();
/*        while(!input.hasNextInt()){
        System.out.print("Invalid input! Please enter a number(1-10): ");        
        }*/
    }
    guesses +=1;
    
    
    if(choice > guess){
        System.out.println("Wrong guess! Too high");
    } 
    else if(choice < guess){
        System.out.println("Wrong guess! Too low");
    }   
    else if (choice == guess){
        break;
    }
    }
    
   
    String rating = "";
    if(guesses == 1 ){
    rating = "Legendary"; 
    }
    else if (guesses == 2){
    rating = "Excellent";
    }
    else if( guesses == 3 || guesses == 4){
    rating = "Close!";   
    }
    else {
    rating = "Better Luck";
    }
    System.out.println(rating);
    
    System.out.printf("SUMMARY%nCorrect Number: %d%nRating: %s%nTotal Attempts: %d%n", guess, rating, guesses);
    }
}



