def replace_array(numbers):
    new_list = []
    for index in range(0, len(numbers)):
        if numbers[index] < 0:
            new_list.append(numbers[index])
    return new_list

def sorted_array(prime):
    unsort = []
    for number in prime:
        count = 0
        for factor in range (1, number + 1):
            if number % factor == 0:
                count += 1
            if count == 2
                unsort.append(number)
        
    return sorted_array(prime) 
           
def duplicate(numbers):
    duplicates = []
    for index in range(0, len(numbers)):
        for number in numbers:
            if number[index] == number[index] + 1:
                duplicates.append(number[index])
    return duplicates
    
print(replace_array([5, -9, 3, -6, 2, -11]))    
print(duplicate([45, 60, 3, 0, 67, 2, 45, 3, 22, 0]))
