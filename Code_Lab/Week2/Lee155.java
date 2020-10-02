public class Lee155{
  private List<int[]> stack ;
    private int min ;

    public MinStack() {
        stack = new ArrayList<int[]>();
    }

    public void push(int x) {
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = stack.isEmpty() ? x : Math.min(x, min);
        min = arr[1];
        stack.add(arr);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size()-1);
            min = stack.isEmpty() ? 0 : stack.get(stack.size()-1)[1];
        }
    }

    public int top() {
        return stack.get(stack.size()-1)[0];
    }

    public int getMin() {
        return min;
    }
}
