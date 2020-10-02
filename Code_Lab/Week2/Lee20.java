public class Lee20{
  public boolean isValid(String s) {
        Stack<Character> x = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{')
                x.push('}');
            else if(s.charAt(i) == '[')
                x.push(']');
            else if(s.charAt(i) == '(')
                x.push(')');
            else if(x.size() == 0 || x.pop() != s.charAt(i))
                return false;
        }
        return x.size() ==0;
   
    }

}
