import random

guess = random.randint(1, 100)
guesses = 0
choice = 0

for index in range(1, 6):
    choice = int(input("Enter a number (1-100): "))
    while choice < 1 or choice > 100:
    
        if choice < 1 or choice > 100:
            print("Enter a valid number!")
        elif choice > guess:
            print("Wrong guess! Too high")
            guesses += 1
        elif choice < guess:
            print("Wrong guess! Too low")
            guesses += 1
        elif choice == guess:
            print("Correct Choice: ", choice)
            guesses += 1
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

print(f"SUMMARY\n Correct Number: {choice}\n Rating: {rating}\n Total Attempts: {guesses}")
    
         
            




    

