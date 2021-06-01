package priv.tangxin.algorithm.problem;

import java.util.Arrays;

/**
 * @Desc
 * @Author tangxin
 * @Date 2021/5/26
 */
public class towSums {

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length-1;i++){
            Arrays.binarySearch(nums,target - nums[i]);
            for(int k = i+1 ;k<nums.length; k++ ){
                if((nums[i]+nums[k]) == target) return new int[]{i,k};
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,7,10,15,17};
        int target = 10;
        int[] result =twoSum(nums,target);
        if(result!=null) {
            System.out.println(result[0]+","+result[1]);
        } else {
            System.out.println("not find");
        }

    }





}
