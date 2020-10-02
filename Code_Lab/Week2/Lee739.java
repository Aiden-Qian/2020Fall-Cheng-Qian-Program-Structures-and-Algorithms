public class Lee739{
  public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] rst = new int[n];
        Integer[] tempIndex = new Integer[101]; // assume top temp is 101
        
        for (int i = n - 1; i >= 0; i--) {
            int num = T[i], warmerIndex = Integer.MAX_VALUE;;
            
            for (int t = num + 1; t <= 100; t++) { // find the smallest index that has temp greater than num
                if (tempIndex[t] != null && tempIndex[t] < warmerIndex) warmerIndex = tempIndex[t];
            }
            
            if (warmerIndex < Integer.MAX_VALUE) rst[i] = warmerIndex - i; // default rst[i] = 0
            tempIndex[num] = i;
        }
        
        return rst;
    }
}
