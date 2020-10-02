public class Lee394{
  public String decodeString(String s) {
	String res = "";
	Stack<Integer> countStack = new Stack<>();
	Stack<String> resStack = new Stack<>();
	int idx = 0;
	int curNum = 0;
	while (idx < s.length())
 
	{
		char ch = s.charAt(idx);
		if (Character.isDigit(ch)) {
			while (Character.isDigit(s.charAt(idx)))
				curNum = 10 * curNum 
					+ (s.charAt(idx++) - '0');
		} else if (ch == '[') {
			resStack.push(res);
			res = "";
			countStack.push(curNum);
			curNum = 0;
			idx++;
		} else if (ch == ']') {
			StringBuilder temp = 
				new StringBuilder(resStack.pop());
			
			int repeatTimes = countStack.pop();
			for (int i = 0; i < repeatTimes; i++) {
				temp.append(res);
			}
			res = temp.toString();
			idx++;

		} else {
			res += s.charAt(idx++);
		}
	}
	return res;

}
