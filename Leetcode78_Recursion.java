class Solution {
     public void subsequences(List<List<Integer>>answer,List<Integer> list,int [] arr,int idx){
        if(idx==arr.length){answer.add(new ArrayList<>(list));
        return;}
        
        //take it
        list.add(arr[idx]);
        //explore
        subsequences(answer,list,arr,idx+1);
        //undo
        list.remove(list.size()-1);
        //explore
        subsequences(answer,list,arr,idx+1);

     }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        subsequences(answer,list,nums,0);
        return answer;
    }
}
