n = input()
num = ""
for i in n:
    if i in '0123456789':
        num = num + i
num = list(set(num))
if len(num) == 0:
    print(-1)
elif (('0' not in num) and ('2' not in num) and ('4' not in num) and ('6' not in num) and ('8' not in num)):
    print(-1)
else:
    num.sort(reverse = True)
    if(int(num[-1])%2==0):
        ans = ''.join(num)
        print(ans)
    else:
        s = num[-1]
        for digit in num:
            if int(digit)%2 == 0:
                s = digit
        num.remove(s)
        num.append(s)
        ans = ''.join(num)
        print(ans)
