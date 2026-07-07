class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int maxFreq=0;
        int n=s.length();
        int maxLen=0;
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));
            while((j-i+1)-maxFreq>k){
                char c=s.charAt(i);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                i++;

            }
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}
