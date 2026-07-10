class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list;
        HashMap<Character,Integer> map=new HashMap<>();
        int k=p.length();
        for(char ch:p.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        int count=map.size();
        for(int i=0;i<k;i++){
            if(map.containsKey(s.charAt(i))){

           map.put( s.charAt(i),map.get(s.charAt(i))-1);
           if(map.get(s.charAt(i))==0) count--;
            }
        }
        if(count==0)list.add(0);
        
        //For all other windows;
        for(int i=k;i<s.length();i++){
          if(map.containsKey(s.charAt(i-k))){
             map.put(s.charAt(i-k),map.get(s.charAt(i-k))+1);
             if(map.get(s.charAt(i-k))==1)count++;
          }
          if(map.containsKey(s.charAt(i))){

           map.put( s.charAt(i),map.get(s.charAt(i))-1);
           if(map.get(s.charAt(i))==0) count--;
            }
            
            if(count==0) list.add(i-k+1);
        }
        return list;
    }
}
