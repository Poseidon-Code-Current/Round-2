def find_length_of_last_word(sentence):
    words = sentence.strip().split()
    return len(words[-1]) if words else 0

if __name__ == "__main__":
    N = int(input())
    for _ in range(N):
        sentence = input().strip()
        print(find_length_of_last_word(sentence))