public class Lee316{
  public static String removeDuplicate_Recursively(String s){
        if(s == null)
            return null;
        int len = s.length();  
        if(len == 0) return "";  
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();  
        for(int i = 0;i < len;i++){  
            char c = s.charAt(i);  
            if(map.containsKey(c)){  
                map.put(c, map.get(c) + 1);  
            } else {  
                map.put(c, 1);  
            }     
        }  

          char ch = s.charAt(0);  
          int pos = 0;  
          for(int i = 0;i < len;i++){  
              char c = s.charAt(i);  
              if(c < ch) {   
                  ch = c;  
                  pos = i;  
              }  
              if(map.get(c) == 1) {         
                  s = s.substring(pos + 1).replaceAll(ch + "", "");  
                  return ch + removeDuplicate_Recursively(s);  
              }  else {  
                  map.put(c, map.get(c) - 1);  
              }    
          }
          
          return "";
    }
}
