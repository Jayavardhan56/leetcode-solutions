# 1037. Valid Boomerang

### Difficulty: Easy

## Description
Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.

A boomerang is a set of three points that are all distinct and not in a straight line.

 
Example 1:
Input: points = [[1,1],[2,3],[3,2]]
Output: true
Example 2:
Input: points = [[1,1],[2,2],[3,3]]
Output: false

 
Constraints:


	points.length == 3
	points[i].length == 2
	0 <= xi, yi <= 100

## Submission Details
- **Status**: Accepted
- **Runtime**: 0 ms
- **Memory**: 42888000
- **Language**: java

## Code
```java
class Solution {
    public boolean isBoomerang(int[][] points) {
        //(y2-y1)*(x3-x2) != (y3-y2)*(x2-x1)
        return (points[1][1]-points[0][1])*(points[2][0]-points[1][0])!=(points[2][1]-points[1][1])*(points[1][0]-points[0][0]);
    }
}
```
