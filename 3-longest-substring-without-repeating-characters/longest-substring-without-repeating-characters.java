class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int maxLen=0,start=0;
        
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
                 
            }
                         
            set.add(s.charAt(i));    
            maxLen=Math.max(maxLen,i-start+1);
            
        }
        return maxLen;
    }
}