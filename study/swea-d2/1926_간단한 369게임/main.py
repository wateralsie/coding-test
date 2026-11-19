# 베스트 코드 (61ms)
import sys
sys.stdin = open("input.txt", "r")

N = int(input())
result = []

for n in range(1, N + 1):
    s = str(n)
    cnt = sum(c in "369" for c in s)
    result.append("-" * cnt if cnt else s)

print(" ".join(result))


# 57ms
# import sys
# sys.stdin = open("input.txt", "r")
#
# N = int(input())
#
# for n in range(1, N + 1):
#     n_str = str(n).replace("3", "-").replace("6", "-").replace("9", "-")
#     if n_str.find("-") != -1:
#         n_str = "".join(c for c in n_str if not c.isdigit())
#     print(n_str, end=" ")