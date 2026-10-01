# 20. Valid Parentheses

### Difficulty: Easy

## Description
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:


	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Every close bracket has a corresponding open bracket of the same type.


 
Example 1:


Input: s = "()"

Output: true


Example 2:


Input: s = "()[]{}"

Output: true


Example 3:


Input: s = "(]"

Output: false


Example 4:


Input: s = "([])"

Output: true


Example 5:


Input: s = "([)]"

Output: false


 
Constraints:


	1 <= s.length <= 104
	s consists of parentheses only '()[]{}'.

## Submission Details
- **Status**: Accepted
- **Runtime**: 3
- **Memory**: 43256000
- **Language**: java

## Code
```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                s1.push(c);
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
                char top=s1.pop();
                if((c==')' && top!='(')||(c==']' && top!='[')||(c=='}' && top!='{')){
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}
```
