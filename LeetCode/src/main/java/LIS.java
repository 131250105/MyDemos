/**
 * Created by zy118686 on 16/10/31.
 */

public class LIS {

    public static int LIS(int[] nums){
        int[] d = new int[nums.length];
        int maxlength = 1;
        for(int i = 0;i<nums.length ; i++){
            d[i] = 1;
            for(int j = 0 ; j < i ; j++){
                if(nums[i]>nums[j] && d[i]<(d[j]+1)){
                    d[i] = d[j]+1;
                }
            }
            if(maxlength<d[i]){
                maxlength = d[i];
            }
        }
        return maxlength;
    }

    public static void main(String[] args){
        System.out.println(LIS.LIS(new int[]{5,3,4,8,6,7}));
    }
}
