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