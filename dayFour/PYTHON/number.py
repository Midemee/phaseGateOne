def get_sum_of(array, target):
    numbers = [0,0]
    
    for index in range(len(array)):
        for inner in range(index + 1, len(array)):
            if array[index] + array[inner] == target:
                numbers[0] = array[index]
                numbers[1] = array[inner]

    return numbers
    
#def get_words_sort(text):
#    vowels = []
#    consonants = []
#    for index in text:
#        word = index.lower()
#        for letter in word:
#            if (letter.lower() in 'aeiou'):
#                vowels.append(word)
#        if (index not in vowels):
#            consonants.append(word)
#            
#    return [vowels, consonants]


def has_vowel(word):
    for character in word:

        if character.lower() in vowels:

            return True

    return False

def separate_consonants_and_vowels_words(words):
    vowel_words = []
    consonant_words = []

    for word in words:
        if has_vowel(word):
            vowel_words.append(word)
        else:
            consonant_words.append(word)

    separated_words = [consonant_words, vowel_words]
    return separated_words
            
            
    
        
