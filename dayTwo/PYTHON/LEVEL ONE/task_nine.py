price = float(input("Enter the price of item: "))

discount = price * (10.0 / 100.0)
discountedPrice = price - discount

print(f"Discount: {discount}\nDiscounted Price: {discountedPrice:.2f}")
