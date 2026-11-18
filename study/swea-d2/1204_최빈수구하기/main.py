import sys
sys.stdin = open("input.txt", "r")

T = int(input())
for test_case in range(1, T + 1):
    n = int(input())
    score_list = list(map(int, input().split()))
    count_list = [0] * 101
    max_count = 0
    max_score = 0

    for score in score_list:
        count_list[score] += 1
        if (count_list[score] > max_count) or (count_list[score] == max_count and score > max_score):
            max_score = score
            max_count = count_list[score]

    print(f"#{n} {max_score}")

# ////////////////////////////////////////////////////////////

# import sys
#
# sys.stdin = open('input.txt', 'r')
#
# T = int(input())
# for i in range(1, T+1):
#     n = int(input())
#     score_list = list(map(int, input().split()))
#     max_count = 0
#     max_score = 0
#
#     for score in score_list:
#         if score_list.count(score) > max_count:
#             max_score = score
#             max_count = score_list.count(score)
#
#     print(f"#{n} {max_score}")
