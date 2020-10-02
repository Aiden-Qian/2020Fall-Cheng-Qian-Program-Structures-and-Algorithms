public class Lee921{
  public int minAddToMakeValid(String S) {
          if(S == null || S.length() == 0){
              return 0;
          }
          
          int res = 0;
          int leftCount = 0;
          for(int i = 0; i<S.length(); i++){
             char c = S.charAt(i);
             if(c == '('){
                 leftCount++;
             }else if(leftCount > 0){
                 leftCount--;
             }else{
                 res++;
             }
         }
         
         res += leftCount;
         return res;
     }
}
