s = input();
x=""
for i in s:
    if i.isalnum():
        x+=i
x=x[::-1]
x=list(x)
for i in range(len(s)):
    if((s[i].isalnum()==False)):
        x.insert(i,s[i])
print("".join(x))
