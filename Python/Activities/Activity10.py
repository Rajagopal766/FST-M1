# Given tuple
#num_tuple = (10, 20, 33, 46, 55)

values = input('Please enter some values:')

#spliting the input values by space
num_tuple = tuple(int(val) for val in values.split())

#print('tuple:',input_tuple)
print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)