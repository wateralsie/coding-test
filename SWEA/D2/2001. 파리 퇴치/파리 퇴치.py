T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]
    max_total = 0
    for y in range(N - M + 1):
        for x in range(N - M + 1):
            total = 0
            for j in range(y, y + M):
                total += sum(board[j][x:x+M])
            max_total = max(max_total, total)
    print(f"#{test_case} {max_total}")