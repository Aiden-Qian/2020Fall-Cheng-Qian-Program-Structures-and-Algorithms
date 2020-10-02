public class Lee71{
  public String simplifyPath(String path) {
    	Stack<String> stack1 = new Stack<String>();
    	String[] str = path.split("/");
    	
    	for(int i = 0; i < str.length; i++){
    		if(str[i].equals(".") || str[i].length() == 0)
    			continue;
    		else if(str[i].equals("..")){
    			if(!stack1.isEmpty())
    				stack1.pop();
    		}
    		else{
    			stack1.push(str[i]);
    		}
    	}
    	
    	StringBuffer a = new StringBuffer();
    	Stack<String> stack2 = new Stack<String>();
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	while(!stack2.isEmpty()){
    		a.append("/" + stack2.pop());
    	}
    	if(a.length() == 0) a.append("/");
    	
    	return a.toString();
    }

}
