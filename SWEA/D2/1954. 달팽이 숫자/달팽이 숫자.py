T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    board = [[0] * N for _ in range(N)]
    x = 0
    y = 0
    dx = [1, 0, -1, 0]
    dy = [0, 1, 0, -1]
    d = 0
    for i in range(N*N):
        board[y][x] = i + 1
        nx = x + dx[d]
        ny = y + dy[d]
        if nx < 0 or nx > N-1 or ny < 0 or ny > N-1 or board[ny][nx] != 0:
            d = (d + 1) % 4
        x = x + dx[d]
        y = y + dy[d]
    print(f"#{test_case}")
    for i in range(N):
        print(*board[i])