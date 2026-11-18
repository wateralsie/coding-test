# 베스트 코드 (839ms)
import sys
sys.stdin = open("input.txt", "r")

T = int(input())
for test_case in range(1, T + 1):
    days = int(input())
    price_list = list(map(int, input().split()))
    max_price = 0
    profit = 0
    # 최댓값을 알고 난 후 각 상품의 이윤을 더하는 방식
    for price in reversed(price_list):
        if price > max_price:
            max_price = price
        else:
            profit += max_price - price
    print(f"#{test_case} {profit}")


# 두번째 시도 (통과 - 1363ms)
# import sys
# sys.stdin = open("input.txt", "r")
#
# T = int(input())
# for test_case in range(1, T + 1):
#     days = int(input())
#     price_list = list(map(int, input().split()))
#     profit = 0
#     # 그냥 최댓값 될때까지 매일 사고 최댓값때 전부 팔면 되는거 아님? - 이걸 반복하기
#     # 각 상품 매매 이득 = 판매가격 - 구매가격
#     while len(price_list) > 1:
#         max_price = max(price_list)
#         max_index = price_list.index(max_price)
#         sliced_price_list = price_list[:max_index]
#         profit += sum([max_price - x for x in sliced_price_list])
#         price_list = price_list[max_index + 1:]
#     print(f"#{test_case} {profit}")


# 첫번째 시도 (시간 초과로 실패 + 테케 10개 중 7개 맞음)
# import sys
# sys.stdin = open("input.txt", "r")
#
# T = int(input())
# for test_case in range(1, T + 1):
#     days = int(input())
#     price_list = list(map(int, input().split()))
#     profit = 0
#     # 그냥 최댓값 될때까지 매일 사고 최댓값때 전부 팔면 되는거 아님? - 이걸 반복하기
#     # 각 상품 매매 이득 = 판매가격 - 구매가격
#     while len(price_list) > 1:
#         sliced_price_list = price_list[:price_list.index(max(price_list))]
#         profit += sum([max(price_list) - x for x in sliced_price_list])
#         price_list = price_list[price_list.index(max(price_list))+1:]
#     print(f"#{test_case} {profit}")
