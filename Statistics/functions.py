# The basic functionalities of statistics


# Mean value
def mean(arr):

    """Passing an array to the function, it will return the mean value"""

    total = 0
    for num in arr:
        total += num
    return total / len(arr)


# Median value
def median(arr):

    """Passing an array to function, it will return the median value"""

    length = len(arr)
    sort_arr = sorted(arr) # sorting array 

    if (length % 2 == 1):
        n = int(length / 2)
        return sort_arr[n]

    else:
        midpoint1 = int((length / 2) - 1)
        midpoint2 = int(length / 2)

        return (sort_arr[midpoint1] + sort_arr[midpoint2]) / 2
    

# Quartiles
def quartile(arr, Q):
        
    length = len(arr)
    sort_arr = sorted(arr) # sorting array 
    print(sort_arr)

    if (Q == 1):
        n = int(length / 4)
        return sort_arr[n]

    elif (Q == 2):
        median(arr)
    
    elif (Q == 3):
        n = int(length * 3 / 4)
        return sort_arr[n]

    else:
        pass

