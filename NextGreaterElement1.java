class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        stack.push(m-1);
        map.put(nums2[m-1],-1);

        //NGE MAP FOR NUMS2
        for (int i=m-2;i>=0;i--){
            if(nums2[i]<nums2[stack.peek()]) {
                map.put(nums2[i],nums2[stack.peek()]);
                stack.push(i);
            }
            else{
                while(!stack.isEmpty()&&nums2[i]>=nums2[stack.peek()]) stack.pop();
                if(stack.isEmpty()) map.put(nums2[i],-1);
                else map.put(nums2[i],nums2[stack.peek()]);
                stack.push(i);

            }
        }
        
    //Traversing nums1
    int [] ans=new int[n] ;
    for(int i=0;i<n;i++){
         ans[i]=map.get(nums1[i]);
    }

    return ans;
    }
}
