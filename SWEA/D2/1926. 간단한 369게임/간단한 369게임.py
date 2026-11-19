N = int(input())

for n in range(1, N + 1):
    n_str = str(n).replace("3", "-").replace("6", "-").replace("9", "-")
    if n_str.find("-") != -1:
        n_str = "".join(c for c in n_str if not c.isdigit())
    print(n_str, end=" ")