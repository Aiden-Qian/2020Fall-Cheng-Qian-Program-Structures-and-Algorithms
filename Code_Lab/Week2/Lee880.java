public class Lee880{
  public String decodeAtIndex(String S, int K) {
        long size = 0;
        char[] chs = S.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] >= '0' && chs[i] <= '9') size *= (chs[i] - '0');
            else size++;
        }
        for (int i = chs.length - 1; i >= 0; i--) {
            if ((K == 0 || K == size) && !Character.isDigit(chs[i])) return String.valueOf(chs[i]);
            if (chs[i] >= '0' && chs[i] <= '9') {
                size /= (chs[i] - '0');
                K %= size;
            }
            else size--;
        }
        return "";
    }

}
