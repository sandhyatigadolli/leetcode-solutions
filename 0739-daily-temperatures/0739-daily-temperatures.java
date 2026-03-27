class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[temperatures.length];
    Arrays.fill(result,0);

    for(int i=0;i<temperatures.length;i++) {
        while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])   {
             int prev_index = stack.pop();
             result[prev_index] = i - prev_index;
        }
        stack.push(i);
    }  
    return result;  
    }
}