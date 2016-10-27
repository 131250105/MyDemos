/**
 * Created by zy118686 on 16/10/27.
 * 一个数组记录字符串中字符的位置
 * start表示开始记录位置,在出现重复之后,始终保持在最后一个重复字符的下一个位置
 * 在重置start之前,先将length前面最长的length记录下来
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.trim().equals("")){
            return 0;
        }
        else if(s.length() == 1){
            return 1;
        }else {
            int start = 0;
            int logestlength = 0;
            int last = 0;
            char[] chars = s.toCharArray();
            int[] ascii = new int[128];
            for(int i = 0 ; i<128;i++){
                ascii[i] = -1 ;
            }
            for(int j = 0 ; j < chars.length; j++){
                if(ascii[chars[j] - ' '] != -1) {
                    if(logestlength < (j-start)){
                        logestlength = j - start ;
                    }
                    if((ascii[chars[j] -' '] + 1)>last) {
                        start = ascii[chars[j] - ' '] + 1;
                        last = start ;
                    }
                }

                ascii[chars[j] - ' '] = j;
            }

            if(logestlength < (s.length()-start)){
                logestlength = s.length() - start ;
            }

            return logestlength;
        }
    }

    public static void main(String[] args){
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters= new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abba"));
    }
}
