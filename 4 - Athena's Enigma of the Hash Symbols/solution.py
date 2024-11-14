def check_if_pair_exists(scroll):
    hash_count = 0
    numbers = []
    seen = set()

    for char in scroll:
        if char == '#':
            hash_count += 1
        elif char.isdigit():
            numbers.append(int(char))

    for num in numbers:
        key = hash_count - num
        if key in seen:
            return "Yes"
        seen.add(num)
    return "No"

# Input reading
t = int(input())
for _ in range(t):
    scroll = input()
    print(check_if_pair_exists(scroll))
