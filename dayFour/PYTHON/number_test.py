from unittest import TestCase
import number

class numbertest(TestCase):

    def test_that_the_addition_of_numbers_gives_correct_result(self):
        number_list = [8, 6, 12, 4, -2]
        target = 6;
        expected = [8, -2];
        actual = number.get_sum_of(number_list, target)
        self.assertEqual(expected, actual)
        
    def test_that_an_array_returns_a_list_of_vowels_only(self):
        text = ["pie", "fly", "pat"]
        expectedVowels = [["pie", "pat"], ["fly"]]
        #expectedConsonants = ["fly"]
        actual = number.get_words_sort(text)
        self.assertEqual(expectedVowels, actual)
        #self.assertEqual(expectedConsonants, actual)
        
#    def test_that_an_array_returns_a_list_of_consonants_only(self):
#        text = ["pie", "fly", "pat"]
#        expected = ["fly"]
#        actual = number.get_words_sort(text)
#        self.assertEqual(expected, actual)
