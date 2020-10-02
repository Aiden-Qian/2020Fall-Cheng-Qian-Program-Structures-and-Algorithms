public class Lee224{
  Stack<Integer> stk = new Stack<>();
	int sign = 1;
	int res = 0;
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (Character.isDigit(ch)) {
			int curSum = s.charAt(i) - '0';
			while (i + 1 < s.length() 
					&& Character.isDigit(s.charAt(i + 1)))
				curSum = curSum * 10 + s.charAt(++i) - '0';
			res += sign * curSum;
		} else if (ch == '+')
			sign = 1;
		else if (ch == '-')
			sign = -1;
		else if (ch == '(') {
			stk.push(res);
			res = 0;
			stk.push(sign);
			sign = 1;
		} else if (ch == ')') {
			res = stk.pop() * res + stk.pop();
		}
	}
	return res;

}
