with open('one.txt') as f:
    lines = f.readlines()

maxElf = 0
temp = 0

arr = []
for line in lines:
    if line == '\n':
        maxElf = max(maxElf, temp)
        arr.append(temp)
        temp = 0
        continue
    temp += int(line.rstrip())
arr.sort()
print(arr[-1]+arr[-2]+arr[-3])
print(maxElf)
