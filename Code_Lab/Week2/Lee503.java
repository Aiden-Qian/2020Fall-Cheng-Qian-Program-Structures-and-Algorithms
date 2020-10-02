public class Lee503{
  public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] next = new int[n];
        Arrays.fill(next,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<2*n; i++) {
            int num = nums[i % n];
            while(!stack.isEmpty() && num > nums[stack.peek()]) next[stack.pop()] = num;
            if(i < n) stack.push(i);
        }
        return next;
    }
}
