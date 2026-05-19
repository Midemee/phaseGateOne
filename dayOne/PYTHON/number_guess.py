import random

guess = random.randint(1, 100)
guesses = 0
choice = 0

for index in range(1, 6):
    choice = int(input("Enter a number (1-100): "))
    while choice < 1 or choice > 100:
        choice = int(input("Invalid input! Enter a number (1-10): ") )   
    guesses += 1
    
    if choice > guess:
        print("Wrong guess! Too high")

    elif choice < guess:
        print("Wrong guess! Too low")

    elif choice == guess:
        break;
            
rating = ""   
if guesses == 1:
    rating = "Legendary"
elif guesses == 2:
    rating = "Excellent"
elif guesses == 3 or guesses == 4:
    rating = "Close!"
else:
    rating = "Better Luck"
print(rating)

print(f"SUMMARY\n Correct Number: {guess}\n Rating: {rating}\n Total Attempts: {guesses}")
    
         
            




    

