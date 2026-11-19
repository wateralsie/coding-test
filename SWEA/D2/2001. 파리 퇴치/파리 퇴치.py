T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]
    max_total = 0
    x = 0
    y = 0
    for y in range(N):
        if y + M > N:
            break
        else:
            for x in range(N):
                if x + M > N:
                    break
                else:
                    total = 0
                    for j in range(y, y + M):
                        for i in range(x, x + M):
                            total += board[j][i]
                        if total > max_total:
                            max_total = total
    print(f"#{test_case} {max_total}")