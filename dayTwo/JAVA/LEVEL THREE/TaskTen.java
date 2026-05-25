public class TaskTen{
    public static void main(String[] args){
    int number = 5678;
    int count = 0;

    for (int index = 1; index <= number; index++){
       int remainder = number % 10;
       number = number / 10;
       count++;
    }
    
    System.out.println("Count: " + count);
    }
}
