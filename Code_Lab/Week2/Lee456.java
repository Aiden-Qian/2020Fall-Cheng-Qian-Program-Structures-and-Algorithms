public class Lee456{
  public boolean find132pattern(int[] nums) {
        int middle = Integer.MIN_VALUE;
        Stack <Integer> stack = new Stack <> ();
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < middle) return true;
            while(!stack.isEmpty() &&
                 nums[i] > stack.peek()){
                middle = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
