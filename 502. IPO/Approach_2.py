class Solution:
    def findMaximizedCapital(self, k: int, w: int, profits: List[int], capital: List[int]) -> int:
        projects = [(capital[i], profits[i]) for i in range(len(profits))]
        projects.sort()
        max_heap = []

        i = 0
        while i < (len(projects)):
            if w >= projects[i][0]:
                heapq.heappush(max_heap, -projects[i][1])
                i += 1
            elif k > 0 and max_heap:
                k -= 1
                w -= heapq.heappop(max_heap)
            else:
                break
            
        while max_heap and k > 0:
            w -= heapq.heappop(max_heap)
            k -= 1
        
        return w