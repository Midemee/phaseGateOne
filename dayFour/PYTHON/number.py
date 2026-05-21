def getSumOf(array, target):
    numbers = []
    
    for index in range(len(array)):
        for inner in range(len(array)):
            if array[index] + array[inner] == target:
                numbers.append = array[index]
                numbers.append = array[inner]
                #numbers += array[index]
                #numbers += array[inner]
    return numbers
