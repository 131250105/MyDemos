import sun.security.provider.Sun;

/**
 * Created by zy118686 on 16/11/1.
 */
public class Sunday {

    public void Sunday(String dest , String pattern){

        char[] destchars = dest.toCharArray();
        char[] patternchars = pattern.toCharArray();

        int i = 0;
        int j = 0;

        while(i <= (dest.length() - pattern.length() + j )  ){
            if( destchars[i] != patternchars[j] ){
                if(i == (dest.length() - pattern.length() + j )){
                    break;
                }
                int pos = contains(patternchars,destchars[i+pattern.length()-j]);
                if( pos== -1){
                    i = i + pattern.length() + 1 - j;
                    j = 0 ;
                }else{
                    i = i + pattern.length() - pos - j;
                    j = 0;
                }
            }else{
                if(j == (pattern.length() - 1)){
                    System.out.println("the start pos is "+(i-j)+" the end pos is "+i);
                    i = i - j + 1 ;
                    j = 0;
                }else{
                    i++;
                    j++;
                }
            }
        }
    }

    private int contains(char[] chars,char target){
        for(int i = 0 ; i< chars.length;i++){
            if(chars[i] == target){
                return i ;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Sunday sunday = new Sunday();
        sunday.Sunday("aaaaaaaaaaaaa","aa");
    }
}
