from collections import defaultdict

with open('five.txt') as f:
    lines = f.readlines()

s1 = defaultdict(list)
"""
    [D]
[N] [C]
[Z] [M] [P]
 1   2   3

move 1 from 2 to 1
move 3 from 1 to 3
move 2 from 2 to 1
move 1 from 1 to 2
"""

s1['1'] = ["B", "L", "D", "T", "W", "C", "F", "M"]
s1['2'] = ["N", "B", "L"]
s1['3'] = ["J", "C", "H", "T", "L", "V"]
s1['4'] = ["S", "P", "J", "W"]
s1['5'] = ["Z", "S", "C", "F", "T", "L", "R"]
s1['6'] = ["W", "D", "G", "B", "H", "N", "Z"]
s1['7'] = ["F", "M", "S", "P", "V", "G", "C", "N"]
s1['8'] = ["W", "Q", "R", "J", "F", "V", "C", "Z"]
s1['9'] = ["R", "P", "M", "L", "H"]

"""
s1['1'] = ["Z", "N"]
s1['2'] = ["M", "C", "D"]
s1['3'] = ["P"]
"""

for i in lines:
    i = i.strip().split(" ")
    if len(i) != 6:
        continue

    f = i[3]
    to = i[-1]
    quantity = int(i[1])

    temp = []

    for q in range(quantity):
        temp.append(s1[f].pop())

    # for i in temp:
    for i in temp[::-1]:
        s1[to].append(i)


c = ''
for i in s1:
    c += s1[i][-1]
print(c)
