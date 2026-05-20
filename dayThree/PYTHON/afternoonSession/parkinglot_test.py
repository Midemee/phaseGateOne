'''PSEUDOCODE
Create a list for 20 slots
zeros for empty, Ones for occupied
car enter slot from the left and right...(index 1 & index 19)
car can leave by specifying slot no
display parking status after each to show available or filled space'''


from unittest import TestCase
import parkinglot

class parkinglotTest(TestCase):

    def test_that_the_slot_one_is_occupied(self):
        slots = [0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0,1,1,1,0,0,0,0,0]
        expected = parkinglot.get_slots(slots)
        result = [1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0,1,1,1,0,0,0,0,0]
        self.assertNotEqual(expected, result)
        
    def test_that_slot_2_is_occupied(self):
        slots = [0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0,1,1,1,0,0,0,0,0]
        expected = parkinglot.get_slots(slots)
        result = [1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0,0,0,0,0]
        self.assertNotEqual(expected, result)
        
    def test_that_slot_3_is_occupied(self):
        slots = [0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0,1,1,1,0,0,0,0,0]
        expected = parkinglot.get_slots(slots)
        result = [1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0,0,0,0,0]
        self.assertNotEqual(expected, result)
        
    def test_that_slot_4_is_occupied(self):
        slots = [0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0,1,1,1,0,0,0,0,0]
        expected = parkinglot.get_slots(slots)
        result = [1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0,0,0,0,0]
        self.assertNotEqual(expected, result)
        
    def test_that_slot_20_is_occupied(self):
        slots = [0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0,1,1,1,0,0,0,0,0]
        expected = parkinglot.get_slots(slots)
        result = [1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0,0,0,0,1]
        self.assertNotEqual(expected, result)
        
    def test_that_slot_19_is_occupied(self):
        slots = [0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0,1,1,1,0,0,0,0,0]
        expected = parkinglot.get_slots(slots)
        result = [1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0,0,0,1,1]
        self.assertNotEqual(expected, result)
