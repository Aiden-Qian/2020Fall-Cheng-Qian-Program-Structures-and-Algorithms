public class Lee895{
   Map<Integer, Integer> map;
    List<Stack<Integer>> stacks;
 
    public FreqStack() {
        map = new HashMap<>();
        stacks = new ArrayList<>();
    }
 
    public void push(int x) {
        int freq = map.getOrDefault(x, 0);
        freq++;
        map.put(x, freq);
        if (freq > stacks.size()) {
            Stack<Integer> stack = new Stack<>();
            stack.push(x);
            stacks.add(stack);
        }
        else {
            Stack<Integer> stack = stacks.get(freq - 1);
            stack.push(x);
        }
    }
 
    public int pop() {
        Stack<Integer> stack = stacks.get(stacks.size() - 1);
        int res = stack.pop();
        if (stack.isEmpty()) stacks.remove(stacks.size() - 1);
        int freq = map.get(res);
        map.put(res, --freq);
        if (freq == 0) map.remove(res);
        return res;
    }

}
