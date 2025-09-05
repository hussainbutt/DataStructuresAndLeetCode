class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack = new Stack<Integer>();

    public MinStack() {
        this.st = new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }
    
    public void pop() {
        int val = st.pop();
        if(!minStack.isEmpty() && minStack.peek() == val)
            minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */