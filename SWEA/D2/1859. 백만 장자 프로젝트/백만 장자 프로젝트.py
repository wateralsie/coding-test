T = int(input())
for test_case in range(1, T + 1):
    days = int(input())
    price_list = list(map(int, input().split()))
    profit = 0
    while len(price_list) > 1:
        max_price = max(price_list)
        max_index = price_list.index(max_price)
        sliced_price_list = price_list[:max_index]
        profit += sum([max_price - x for x in sliced_price_list])
        price_list = price_list[max_index + 1:]
    print(f"#{test_case} {profit}")