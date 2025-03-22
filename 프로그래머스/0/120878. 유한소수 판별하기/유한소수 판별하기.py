def solution(a, b):
    gcd = 1
    for i in range(1, b):  
        if a % i == 0 and b % i == 0:  
            gcd = i
    last_b = b // gcd
    while last_b % 2 == 0:
            last_b //= 2
    while last_b % 5 == 0:
            last_b //= 5
    if last_b == 1:
        return 1
    else:
        return 2
        
        