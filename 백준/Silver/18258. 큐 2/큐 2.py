from collections import deque
import sys

n = int(input())
q = deque()

for i in range(n):
    order = sys.stdin.readline()
    if order.startswith('push'):
        q.append(int(order.split()[1]))
    elif order.startswith('pop') and q : print(q.popleft())
    elif order.startswith('size'):
        print(len(q))
    elif order.startswith('empty'):
        if q: print(0)
        else: print(1)
    elif order.startswith('front') and q : print(q[0])
    elif order.startswith('back') and q : print(q[-1])
    else:
        print(-1)