import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacebookLikesTest{

    @Test
    public void testThatZeroLikesDisplaysZeroLikes(){
    String [] likes = {};
    String message = "no one likes this";
    String expected = FacebookLikes.getLikes(likes);
    assertEquals(message, expected);
    }
    
    @Test
    public void testThatOneLikesDisplaysOneName(){
    String [] likes = {"John"};
    String message = "John likes this";
    String expected = FacebookLikes.getLikes(likes);
    assertEquals(message, expected);
    }
    
    @Test
    public void testThatTwoLikesDisplaysTwoNames(){
    String [] likes = {"John", "Bola"};
    String message = "John and Bola likes this";
    String expected = FacebookLikes.getLikes(likes);
    assertEquals(message, expected);
    }
    
    @Test
    public void testThatThreeLikesDisplaysTwoNamesAndOneOther(){
    String [] likes = {"John","Bola","Toyin"};
    String message = "John Bola and one other likes this";
    String expected = FacebookLikes.getLikes(likes);
    assertEquals(message, expected);
    }
    
    @Test
    public void testThatMoreThanThreeLikesDisplaysTwoNamesAndTheNumberOfOthers(){
    String [] likes = {"John", "Bola", "Toyin", "Tayo", "Peace", "Kola", "Ebuka", "Sharon", "Peace", "David", "Edmond"};
    int length = likes.length -2;
    String message = "John Bola and " + length+ " others likes this";
    String expected = FacebookLikes.getLikes(likes);
    assertEquals(message, expected);
    }
}
