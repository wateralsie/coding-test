T = int(input())
for test_case in range(1, T + 1):
    days = int(input())
    price_list = list(map(int, input().split()))
    max_price = 0
    profit = 0
    for price in reversed(price_list):
        if price > max_price:
            max_price = price
        else:
            profit += max_price - price
    print(f"#{test_case} {profit}")