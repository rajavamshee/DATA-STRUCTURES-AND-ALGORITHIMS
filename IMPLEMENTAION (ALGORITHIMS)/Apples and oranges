import sys

s,t = input().strip().split(' ')
s,t = [int(s),int(t)]
a,b = input().strip().split(' ')
a,b = [int(a),int(b)]
b -= a
s -= a
t -= a
m,n = input().strip().split(' ')
m,n = [int(m),int(n)]
apple = list(filter(lambda x: int(x) >= s and int(x) <= t, input().strip().split(' ')))
orange = list(filter(lambda x: int(x)+b <= t and int(x)+b >=s, input().strip().split(' ')))
print(len(apple))
print(len(orange))
