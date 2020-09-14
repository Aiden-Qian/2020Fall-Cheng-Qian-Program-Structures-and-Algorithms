import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static int SumOfTwo(String n1,String n2){
        if(Integer.parseInt(n1)<0||Integer.parseInt(n2)<0) return 0;
        else{
            return Integer.parseInt(n1)+Integer.parseInt(n2);
        }
    }

    public static void TwoSumP(int[] array,int target){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target) System.out.println(i+" "+j);
            }
        }
    }

    public static int[] rotate(int[] array, int k){
        int l=k%array.length;
        int[] result = new int[array.length];
        for(int i=0;i<array.length;i++){
            result[(i+l)%array.length]=array[i];
        }
        return result;
    }

    public static boolean unique(String str){
        if(str.length()>256) return false;
        boolean[] check=new boolean[256];
        for(int i=0;i<str.length();i++){
            if(check[str.charAt(i)]){
                return false;
            }
            else{
                check[str.charAt(i)]=true;
            }
        }
        return true;
    }

    public static boolean permutation(String s1,String s2){
        if(s1.length()!=s2.length()||s1.length()==0){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(char c:map.keySet()){
            if(map.get(c)!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(SumOfTwo("1","2"));
        int[] array={1,2,3};
        int target=4;
        int k=2;
        TwoSumP(array,target);
        System.out.println(Arrays.toString(rotate(array, 2)));
        System.out.println(unique("banana"));
        System.out.println(permutation("abc","bca"));
    }
}
