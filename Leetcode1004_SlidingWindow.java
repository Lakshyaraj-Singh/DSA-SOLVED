class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int n=nums.length;
        int maxLength=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0 )k--;
            while(k<0 ){
                if(nums[i]==0) k++;
                i++;
            }

            maxLength=Math.max(maxLength,j-i+1);
        }
        return maxLength;
    }
}
