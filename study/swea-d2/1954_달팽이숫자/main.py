# 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
# 아래 표준 입출력 예제 필요시 참고하세요.

# 표준 입력 예제
'''
a = int(input())                        정수형 변수 1개 입력 받는 예제
b, c = map(int, input().split())        정수형 변수 2개 입력 받는 예제
d = float(input())                      실수형 변수 1개 입력 받는 예제
e, f, g = map(float, input().split())   실수형 변수 3개 입력 받는 예제
h = input()                             문자열 변수 1개 입력 받는 예제
'''

# 표준 출력 예제
'''
a, b = 6, 3
c, d, e = 1.0, 2.5, 3.4
f = "ABC"
print(a)                                정수형 변수 1개 출력하는 예제
print(b, end = " ")                     줄바꿈 하지 않고 정수형 변수와 공백을 출력하는 예제
print(c, d, e)                          실수형 변수 3개 출력하는 예제
print(f)                                문자열 1개 출력하는 예제
'''

import sys
sys.stdin = open("input.txt", "r")

T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    # 2차원 리스트 생성
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
    for row in board:
        print(*row)
