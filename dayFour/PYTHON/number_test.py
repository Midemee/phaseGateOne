from unittest import TestCase
import number

class numbertest(TestCase):

    def test_that_the_addition_of_numbers_gives_correct_result(self):
        number_list = {8, 6, 12, 4, -2}
        target = 6;
        expected = {8, -2};
        actual = number.getSumOf(number_list, target);
        assertArrayEquals(expected, actual);
