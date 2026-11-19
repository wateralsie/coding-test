N = int(input())
result = []

for n in range(1, N + 1):
    s = str(n)
    cnt = sum(c in "369" for c in s)
    result.append("-" * cnt if cnt else s)

print(" ".join(result))