public class TaskOne{
    public static void main(String[] args){
    System.out.println(sum(10, 5));
    System.out.println(isEven(20)); 
    System.out.println(square(5));
    System.out.println(temperature(5));
    System.out.println(largestNumber(19, 75, 15));
    System.out.println(interestRate(50000, 10, 5));
    System.out.println(areaOfRectangle(5, 3));
    System.out.println(reverseNumber(4562));
    System.out.println(occurrence("Aramide"));
        
    }

    public static int sum(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    
    public static boolean isEven(int number){
        if (number % 2 == 0){
        return true;
        }
        return false;
    }
    
    public static int square(int number){
    int squared = number * number;
    return squared;
    }
    
    public static double temperature(double celsius){
    double fahrenheit = (1.8 * celsius) + 32;
    return fahrenheit;
    }
    
   public static boolean isPrime (int primeCheck){

    int counter = 2;
    
    while(counter <= primeCheck){
    if (primeCheck % counter == 0){
    primeCheck = primeCheck / counter;
    }
    else {
    counter++;
    }
    }
    }
    
    public static int largestNumber (int firstNumber, int secondNumber, int thirdNumber){
    int largest = firstNumber;
    if (secondNumber > largest){
    largest = secondNumber;
    }
    if (thirdNumber > largest){
    largest = thirdNumber;
    }
    return largest;
    }
    
    public static double interestRate(double principal, double rate, double time){
    double interest = (principal * rate * time) / 100;
        return interest;
    }
    
    public static int areaOfRectangle(int length, int width){
        int area = length * width;
        return area;
    }
    
    public static int reverseNumber(int number){
        int lastDigit = 0;
        int reverse = 0;
        
        for(int index = 0; index <= number; index++){
        lastDigit = number % 10;
        reverse = (reverse * 10) + lastDigit;
        number = number / 10;
        }
        return reverse;
    }
    
    public static int occurrence(String text){
    int length = text.length();    
    int count = 0;
    for (int index = 0; index < text.length(); index++){
        count ++;
   
    }
        return count;
    }
}


