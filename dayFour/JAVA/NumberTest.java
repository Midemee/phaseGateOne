/*PSEUDOCODE
Takes in an array {8, 6, 12, 4, -2} and int 6 (2 parameters)
2 numbers in the array adds to get 6
output{8, -2}*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest{

    @Test
    public void testThatAdditionOfEightAndMinusTwoInArrayGivesCorrectOutput(){
    int [] numberList = {8, 6, 12, 4, -2};
    int target = 6;
    int [] expected = {8, -2};
    int [] actual = Number.getSumOf(numberList, target);
    assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testThatAdditionOfFiveAndSevenInArrayGivesCorrectOutput(){
    int [] numberList = {1, 2, 5, 7, 6, 8, 9};
    int target = 12;
    int [] expected = {5, 7};
    int [] actual = Number.getSumOf(numberList, target);
    assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testThatAdditionOfTwoNegativeNumbersInArrayGivesCorrectOutput(){
    int [] numberList = {-5, 2, 5, 7, -10, 8, 9};
    int target = -15;
    int [] expected = {-5, -10};
    int [] actual = Number.getSumOf(numberList, target);
    assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testThatAdditionOfTwoNumbersGivesCorrectOutput(){
    int [] numberList = {8, 6, 12, 4, -2};
    int target = 14;
    int [] expected = {8, 6};
    int [] actual = Number.getSumOf(numberList, target);
    assertArrayEquals(expected, actual);
    } 
    
    @Test
    public void testThatRemovesDuplicatesAndReturnsNewArrayWithoutDuplicates(){
    int [] numberList = {9, 5, 1, 9, 4, 5, 1, 7};
    int [] expected = {9, 5, 1, 4, 7};
    int [] actual = Number.removeDuplicates(numberList);
    assertArrayEquals(expected, actual); 
    } 
    
    @Test
    public void testThatNumberSortsFromSmallestToLargestInNewArray(){
    int [] sort = {14, 9, 6, 3, 8, 10};
    int [] expected = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    int [] actual = Number.sorted(sort);
    assertArrayEquals(expected, actual); 
    } 
    
    @Test
    public void testThatAnArrayReturnsAListOfVowelsOnly(){
    String [] text = {"pie", "fly", "pat"};
    String expectedVowel = {"pie", "pat"};
    String [] actual = Number.wordSort(text);
    assertArrayEquals(expectedVowel, actual);
    }
    
    @Test
    public void testThatAnArrayReturnsAListOfConsonantsOnly(){
    String [] text = {"pie", "fly", "pat"};
    String expectedVowel = {"fly"};
    String [] actual = Number.wordSort(text);
    assertArrayEquals(expectedVowel, actual);
    }

}
