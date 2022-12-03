with open('three.txt') as f:
    lines = f.readlines()

priority = 0

group = []
for i in lines:
    i = i.strip()
    # h1, h2 = i[:len(i)//2], i[len(i)//2:]
    # s1, s2 = set(h1), set(h2)

    if len(group) < 3:
        group.append(i)

    if len(group) != 3:
        continue

    s1, s2, s3 = set(group[0]), set(group[1]), set(group[2])
    intersect = s1.intersection(s2).intersection(s3)
    for j in intersect:
        # A-Z
        if ord(j) <= 90:
            priority += ord(j)-38
        else:
            priority += ord(j)-96
    group = []

print(priority)
