'''PSEUDOCODE
create the text, showing number of likes
a function that that take an array containing the name of people that like an item
if array is empty = no one likes this
else 1person - display name
else if 2 people - display the 2 names
else if 3 people - disply the 3 names
else - display only 2 names and others like this'''


from unittest import TestCase
import likesystem

class likesystemTest(TestCase):
    
    def test_that_list_remains_empty_if_there_are_no_likes(self):
        likes = []
        displayText = "no one likes this"
        expected = likesystem.getLikes(likes)
        self.assertEqual(actual, displayText)
        
    def test_that_list_returns_one_like_if_One_liked(self):    
        expected = likesystem.getLikes(["Mide"])
        displayText = "Mide likes this"
        self.assertEqual(expected, displayText)

    def test_that_list_returns_two_likes_if_One_liked(self):
        expected = likesystem.getLikes(["Mide", "Tobi"])
        displayText = "Mide and Tobi likes this"
        self.assertEqual(expected, displayText)

    def test_that_list_returns_three_likes_if_One_liked(self):
        likes = ["mide"]
        expected = ["mide"]
        actual = likesystem.getLikes(likes)
        self.assertEqual(actual, expected)

    

    
