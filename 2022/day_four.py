with open('four.txt') as f:
    lines = f.readlines()

contained = 0
partial = 0
for i in lines:
    i = i.strip()
    if i == "\n" or i == "":
        print('c')
        continue
    v1, v2 = i.split(',')

    f1, f2 = v1.split('-')
    s1, s2 = v2.split('-')

    arr = [[int(f1), int(f2)], [int(s1), int(s2)]]
    arr = sorted(arr)
    prevS, prevE = arr[0][0], arr[0][1]
    nextS, nextE = arr[1][0], arr[1][1]
    if prevS == nextS:
        prevE, nextE = max(prevE, nextE), min(prevE, nextE)

    if nextS == prevS or nextS <= prevE:
        print((prevS, prevE), (nextS, nextE))
        partial += 1
    else:
        pass



    # if nextS >= prevS and nextS <= prevE and nextE <= prevE:
    #   # print((prevS, prevE), (nextS, nextE))
    # else:
    #    print((prevS, prevE), (nextS, nextE))

print(contained)
print(partial)
