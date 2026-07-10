class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int minLength=Integer.MAX_VALUE;
        int start=0;
        for(int j=0;j<t.length();j++){
            map.put(t.charAt(j),map.getOrDefault(t.charAt(j),0)+1);
        }
        int count=map.size();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
          if(map.containsKey(ch)){
             map.put(ch,map.get(ch)-1);
             if(map.get(ch)==0)count--;
          }

          
          while(count==0){
             if(minLength>(j-i+1)){
                minLength=j-i+1;
                start=i;
            }
            char out=s.charAt(i);
            if(map.containsKey(out)){
                map.put(out,map.get(out)+1);
                if(map.get(out)==1)count++;
            }
            i++;
          }

        }
        if(minLength==Integer.MAX_VALUE) return "";
        return s.substring(start,start+minLength);
    }
}
