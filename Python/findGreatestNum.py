# Ask the user how many numbers they want to compare
n = int(input("How many numbers do you want to compare? "))

# Start by assuming the smallest number possible
greatest = float('-inf')  # This is like saying: "Hey Python, give me the lowest of the low"

# Go through each number one by one
for i in range(n):
    # Ask the user to enter a number
    num = float(input(f"Enter number {i+1}: "))

    # Compare it with the current greatest
    if num > greatest:
        greatest = num  # If this number is bigger, update our greatest!

# After checking all the numbers, tell the user the result
print(f"Out of all the numbers you entered, the greatest is: {greatest}")
