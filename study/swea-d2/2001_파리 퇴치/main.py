# 누적합 (66ms)
import sys
sys.stdin = open("input.txt", "r")

T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]
    P = [[0] * (N + 1) for _ in range(N + 1)]
    for i in range(1, N + 1):
        for j in range(1, N + 1):
            P[i][j] = board[i-1][j-1] + P[i-1][j] + P[i][j-1] - P[i-1][j-1]
    max_total = 0
    for y in range(N - M + 1):
        for x in range(N - M + 1):
            total = P[y+M][x+M] - P[y][x+M] - P[y+M][x] + P[y][x]
            max_total = max(max_total, total)

    print(f"#{test_case} {max_total}")

# 코드 개선 (78ms?)
# import sys
# sys.stdin = open("input.txt", "r")
#
# T = int(input())
#
# for test_case in range(1, T + 1):
#     N, M = map(int, input().split())
#     board = [list(map(int, input().split())) for _ in range(N)]
#     max_total = 0
#     for y in range(N - M + 1):
#         for x in range(N - M + 1):
#             total = 0
#             for j in range(y, y + M):
#                 total += sum(board[j][x:x+M])
#             max_total = max(max_total, total)
#     print(f"#{test_case} {max_total}")


# 두번째 시도 (68ms)
# import sys
# sys.stdin = open("input.txt", "r")
#
# T = int(input())
#
# for test_case in range(1, T + 1):
#     N, M = map(int, input().split())
#     board = [list(map(int, input().split())) for _ in range(N)]
#     max_total = 0
#     x = 0
#     y = 0
#     for y in range(N):
#         if y + M > N:
#             break
#         else:
#             for x in range(N):
#                 if x + M > N:
#                     break
#                 else:
#                     total = 0
#                     for j in range(y, y + M):
#                         for i in range(x, x + M):
#                             total += board[j][i]
#                         if total > max_total:
#                             max_total = total
#     print(f"#{test_case} {max_total}")


# 첫번째 시도 (오답 - 테케 10개 중 5개 맞음)
# import sys
# sys.stdin = open("input.txt", "r")
#
# T = int(input())
#
# for test_case in range(1, T + 1):
#     N, M = map(int, input().split())
#     board = [list(map(int, input().split())) for _ in range(N)]
#     max_total = 0
#     x = 0
#     y = 0
#     for y in range(N):
#         if y + M >= N:
#             break
#         else:
#             for x in range(N):
#                 if x + M >= N:
#                     break
#                 else:
#                     total = 0
#                     for j in range(y, y + M):
#                         for i in range(x, x + M):
#                             total += board[j][i]
#                         if total > max_total:
#                             max_total = total
#     print(f"#{test_case} {max_total}")




