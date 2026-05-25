public class FacebookLikes{
    public static String getLikes(String [] names){

        if (names.length == 0){
            return "no one likes this";
        }  
        else if (names.length == 1){
            return names[0] + " likes this";
        }
        else if (names.length == 2){
            return names[0] + " and " + names[1] + " likes this";
        }
        else if (names.length == 3){
            return String.format("%s %s and one other likes this", names[0], names[1]);
        }
        else{
            return String.format("%s %s and %d others likes this", names[0], names[1], names.length-2);
        }
    }

}



