class MinStack {    // this is my 3rd approach which is best than other 
    Stack<Long> st = new Stack<>();  // tc = sc = o(1)
    long min = -1;    

    public MinStack() {
        // constructor
    }
    
    public void push(long val) {
        long x = (long)val;
        if(st.size() == 0){
            st.push(val);
            min = x;
        }
        else if(x >= min){
            st.push(x);
        }
        else if(val < min){
            st.push(2*x-min);
            min = x;
        }
       
    }
    
    public void pop() {
       if(st.size() == 0) return;
       else if(st.peek() >= min){
        st.pop();
       }else if(st.peek() < min){  // i.e fargi val is here
        //restore the old val
        long old = 2*min - st.peek();
        min = old;
        st.pop();

        }
    }
    
    public int top() {
        if (st.isEmpty()) return -1;

        long topVal = st.peek(); // unbox Long to long

        if (topVal >= min) {
            return (int) topVal; // normal value
        } else {
            return (int) min; // encoded value, actual top is current min
        }
    }


    
    public int getMin() {  // o(1) me min mila
        if(st.size() == 0) return -1;
        return (int)min;
        
    }
}

  //  THIS IS MY 2ND APPROACH

// class MinStack {
//     Stack<Integer> st = new Stack<>();
//     Stack<Integer> min = new Stack<>();  // this is extra space i.e o(n)

//     public MinStack() {
        
//     }
    
//     public void push(int val) {
//         if(st.size() == 0){
//             st.push(val);
//             min.push(val);
//         }else{
//             st.push(val);
//             if(min.peek() < val) min.push(min.peek());
//             else min.push(val);

//         }
       
//     }
    
//     public void pop() {
//         st.pop();
//         min.pop();
        
//     }
    
//     public int top() {
//         return st.peek();
        
//     }
    
//     public int getMin() {  // o(1) me min mila
//         return min.peek();
        
//     }
// }



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */