// Pattern: Stack (Min Stack Design)
// LeetCode: 155 (Min Stack)
// Difficulty: Medium

class MinStack {
    private Stack<long[]> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(new long[]{val, val});
        } else {
           long min = stack.peek()[1];
           stack.push(new long[]{val, Math.min(val, min)});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return (int)stack.peek()[0];
    }
    
    public int getMin() {
        return (int)stack.peek()[1];
    }
}