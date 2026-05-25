public class Number{
    public static int [] getSumOf(int[] array, int target){
        int [] numbers = new int [2];
        for(int index = 0; index < array.length; index++){
           
            for(int inner = index+1; inner < array.length; inner++){

              if (array[index] + array[inner] == target){
                numbers[0] = array[index];
                numbers[1] = array[inner];
    
             }
            
            }
        }
            return numbers;
    }
    
    public static int [] removeDuplicates(int[] numbers){

        for(int index = 0; index < numbers.length; index++){
            for(int inner = index + 1; inner < numbers.length; inner++){
                if (numbers[index] == numbers[inner]){
                    numbers[inner] = -1;
                }
            
            }
        
        }
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] != -1){
            count++;

            }
        }
        
        int [] sorted = new int [count];
        int counter = 0;
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] != -1){
                sorted[counter] += numbers[index];
                counter++;
            }
        }
        return sorted;
    }
    
    public static int[] sorted(int [] sort){

        int largest = sort[0];
        int smallest = sort[0];
        
        for (int index = 0; index < sort.length; index++){
            if (sort[index] > largest){
                largest = sort[index];
            }
            if (sort[index] < smallest){
                smallest = sort[index];
            }

        }
        
        int count = 0;
        for(int index = smallest; index <= largest; index++){
        count++;
        }
        
        //int counting = (largest - smallest) + 1;
        int [] ascend = new int[count]; 
        int counter = 0;
        for(int index = smallest; index <= largest; index++){
            ascend[counter] += index;
            counter++;
        }       
        return ascend;
    }

/*    public static String [] wordSort(String [] words){
            
        String [] vowel = new String[words.length];
        String [] consonant = new String[words.length];
        int vowelCount = 0;        
        int consonantCount = 0;
        for(int index2 = 0; index2 < words.length(); index2++){
        char letter = Character.toLowerCase(word.charAt(index2));
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
        vowel[vowelCount] += letter;
        }
        else if(letter >= 'a' && letter <= 'z'){
        consonant[consonantCount] += letter;
        consonantCount++;
        }

        }
        System.out.println("Vowels count:" + vowelCount);
        System.out.println("Consonant count:" + consonantCount);
        return vowel;
    
    }*/

}
