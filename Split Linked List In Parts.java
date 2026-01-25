class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }

        int sizeK=length/k;
        int rem =(length%k);
        ListNode curr=head;
        ListNode []ans=new ListNode [k];
       
       
        for(int i=0;i<k;i++){
           ans[i]=curr;
           for(int j=0;j<sizeK+(rem>0?1:0)-1;j++){
            if(curr==null) break;
             curr=curr.next;
           }
           if(rem>0) rem--;
           if(curr!=null){

          ListNode t=curr.next;
           curr.next=null;
           curr=t;
           }
        
        

        }
    return ans;
    }
}
