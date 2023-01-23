#firstrepeat Character from a string
def firstrepeatCharacter(str):
    dict = {}
    for i in str:
        if(i in dict):
            return i
        else:
            dict[i]=0
    return "No duplicates"
    
n = input("Enter a string:")
print(firstrepeatCharacter(n))

#sample input
#  i/p: abbaac
#  o/p:b
