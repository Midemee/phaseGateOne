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
    if (choice < 1 || choice > 100){
    System.out.println("Enter a valid number!");
    }
        
    else if (choice > guess){
        System.out.println("Wrong guess! Too high");
        guesses += 1;
    }
    else if(choice < guess){
        System.out.println("Wrong guess! Too low");
        guesses += 1;    
    }
    else if(choice == guess){
    guesses += 1; 
    System.out.print(choice);
    break;
    }
   
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
    
    System.out.printf("SUMMARY%nCorrect Number: %d%nRating: %s%nTotal Attempts: %d", choice, rating, guesses);
    }
}



