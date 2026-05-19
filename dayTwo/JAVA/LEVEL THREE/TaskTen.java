public class TaskTen{
    public static void main(String[] args){
    int number = 5678;
    int count = 0;
    int digits = 1;
    for (int index = 1; index <= number; index++){
       int lastDigit = number % 10;
       digits = (digits * 10) + lastDigit;
       number = number / 10;
    }
    
    System.out.println("Count: " + count);
    }
}
