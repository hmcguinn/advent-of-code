from collections import defaultdict

with open('two.txt') as f:
    lines = f.readlines()

scores = {'A': 1, 'B': 2, 'C': 3, 'X': 1, 'Y': 2, 'Z': 3}

m = defaultdict(dict)

m['A']['X'] = 3
m['A']['Y'] = 6
m['A']['Z'] = 0

m['B']['X'] = 0
m['B']['Y'] = 3
m['B']['Z'] = 6

m['C']['X'] = 6
m['C']['Y'] = 0
m['C']['Z'] = 3

arr = []
score = 0
for line in lines:
    #    play = line.rstrip().split()

    # import pdb; pdb.set_trace()
    # played = scores[play[1]]
    # won = m[play[0]][play[1]]
    line = line.split()
    if len(line) < 2:
        print(line)
        continue

    # lose
    if line[1] == 'X':
        if line[0] == 'A':
            line[1] = 'Z'
        if line[0] == 'B':
            line[1] = 'X'
        if line[0] == 'C':
            line[1] = 'Y'
    # draw
    elif line[1] == 'Y':
        if line[0] == 'A':
            line[1] = 'X'
        if line[0] == 'B':
            line[1] = 'Y'
        if line[0] == 'C':
            line[1] = 'Z'
    # win
    elif line[1] == 'Z':
        if line[0] == 'A':
            line[1] = 'Y'
        if line[0] == 'B':
            line[1] = 'Z'
        if line[0] == 'C':
            line[1] = 'X'

    played = scores[line[1]]
    print(line)
    won = m[line[0]][line[1]]

    score += played + won

    print((line, played, won))
print(score)
