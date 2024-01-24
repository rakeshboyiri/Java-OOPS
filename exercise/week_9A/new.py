l = []
n = int(input("Enter the size of list : "))
for i in range(n):
    l.append(int(input("Enter the element : ")))
target = int(input("Enter the element to search : "))
low = 0 
high = n -1
while(low<=high):
    mid = (low+high)//2
    if(l[mid]==target):
        print("Found at ",mid,"position")
        break
    elif(target>l[mid]):
        low = mid +1
    else:
        high = mid -1
else:
    print("Element not found")