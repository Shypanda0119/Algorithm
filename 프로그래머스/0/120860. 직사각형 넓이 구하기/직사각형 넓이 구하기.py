def solution(dots):
    width = max(dots[0][0], dots[2][0]) - min(dots[0][0], dots[2][0])
    height = max(dots[0][1], dots[1][1]) - min(dots[0][1], dots[1][1])
    return width * height