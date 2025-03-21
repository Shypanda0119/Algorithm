def solution(score):
    total_scores = [sum(i) for i in score] 
    sorted_scores = sorted(total_scores, reverse=True)  
    rank = {}  
    current_rank = 1  
    for i, s in enumerate(sorted_scores):
        if s not in rank:  
            rank[s] = current_rank  
        current_rank += 1  

    return [rank[sum(j)] for j in score]  