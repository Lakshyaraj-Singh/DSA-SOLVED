class Solution {
    public int maxVowels(String s, int k) {
        int maxCount=0;
        int count=0;
        for(int i=0;i<k;i++){
         if(checkVowel(s.charAt(i)))count++;
        }
        maxCount=count;
        //For other windows
        for(int i=k;i<s.length();i++){
            if(checkVowel(s.charAt(i)))count++;
            if(checkVowel(s.charAt(i-k))) count--;

            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
    public boolean checkVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';

    }
}
