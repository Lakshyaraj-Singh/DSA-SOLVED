class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr=head.next;
        ListNode prev=head;
        if(curr==null ||curr.next==null) return new int []{-1,-1};
        ListNode forw=head;
        int idx=1;
        int maxDis=-1;
        int minDis=Integer.MAX_VALUE;
        int firstIdx=-1;
        int lastIdx=-1;
        while(curr.next!=null){
            forw=curr.next;
            if((prev.val<curr.val &&curr.val>forw.val)||
            (prev.val>curr.val&&curr.val<forw.val)){
                if(firstIdx==-1){
                    firstIdx=idx;
                }
                if(lastIdx==-1){
                    lastIdx=idx;
                }
                else{
                    minDis=Math.min(minDis,idx-lastIdx);
                    lastIdx=idx;
                }
            }
            prev=curr;
            curr=forw;
            idx++;



        }
        maxDis=lastIdx-firstIdx;
        if(lastIdx==firstIdx){
            maxDis=-1;
            minDis=-1;
        }
        return new int []{minDis,maxDis};
    }
}
