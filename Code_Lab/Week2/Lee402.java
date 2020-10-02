public class Lee402{
  public String removeKdigits(String num, int k) {
        int hi = 0;
        char[] tempchs = num.toCharArray();
        StringBuilder builder = new StringBuilder();
 
        int len = num.length();
        for(int i = 0;i < len; i ++) {
            char c = tempchs[i];
            while(k > 0 && hi > 0 && tempchs[hi - 1] > c) {
                hi --;
                k --;
            }
 
            tempchs[hi ++] = c;
        }
 
        boolean trim = false;
        int cl = hi - k;
        for(int i = 0;i < cl;i ++) {
            if((!trim && tempchs[i] == '0')) continue;
            trim = true;
            builder.append(tempchs[i]);
        }
 
        return builder.length() == 0 ? "0" : builder.toString();
    }

}
